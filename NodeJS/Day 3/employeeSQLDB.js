let app = require("express")();
let mysql = require("mysql")
let bodyParser = require("body-parser")

var urlencodedParser = bodyParser.urlencoded({ extended: false })  
  


const connection = mysql.createConnection({
    host     : 'localhost',
    user     : 'root',
    password : 'root',
    database : 'legato_health_db'
  });
  
  connection.connect((err) => {
      if(err) throw err;
      console.log('Connected to MySQL Server!');
  });



let url = "jdbc:mysql://localhost:3306"
let port = 9092;

app.use([bodyParser.text(),bodyParser.json()])
app.use(bodyParser.json());

app.listen(port,() => {console.log(`Node is running on port ${port}`)});

let sql = `UPDATE employee
           SET salary = ?
           WHERE id = ?`;
           
let data = [12000, 7];

app.get("/employee/:id",(request,response) => {
   
    const connection = mysql.createConnection({
        host     : 'localhost',
        user     : 'root',
        password : 'root',
        database : 'legato_health_db'
      });

    let empId = request.params.id;
    connection.query('SELECT * from employee where id='+empId, (err, rows) => {
    if(err) throw err;
    console.log('The data from users employee are: \n', rows);
    response.json(rows)
    });
    connection.end();
});

app.get("/employee",(request,response) => {
    connection.query('SELECT * from employee', (err, rows) => {
    if(err) throw err;
    console.log('The data from users employee are: \n', rows);
    connection.end();
    response.json(rows)
    });
});


app.put('/employee/:id',(request,response) => {
    var sal = 12000;
    var empId = request.params.id;
    
     let reqBody = request.body
     console.log(reqBody)
   
    connection.query(sql, data, (error, results, fields) => {
        if (error){
        return console.error(error.message);
        }
        console.log('Rows affected:', results.affectedRows);
        response.json(results.affectedRows)
    });
})

app.delete('/employee/:id',(request,response) => {
  
    connection.query("delete from employee where id = ?", [6], (error, results, fields) => {
        if (error){
        return console.error(error.message);
        }
        console.log('Deleted Rows :', results.affectedRows);
        response.json(results.affectedRows)
    });
})


app.post('/employee', urlencodedParser,(request,res) => {
    var name
    var salary
  
    response = {  
       
        name:request.body.name ,
        salary:request.body.salary 
    };  
    console.log(response);  
    connection.query("insert into employee (name,salary) values (?,?) ", [request.body.name,request.body.salary], (error, results, fields) => {
            if (error){
            return console.error(error.message);
            }
            console.log('Rows inserted :', results.affectedRows);
            res.sendStatus(200)
        
    });
})