let app= require("express")();
let bodyParser= require('body-parser');
let port=9090;

app.use([bodyParser.json()]);
//GET Operation
app.get('/employee/:id/:name/:salary',(request, response)=>{
    //let employee={name:"Shubham", age:27};
    let employee={id:p.id ,name:p.name, salary:p.salary};
    response.json(employee);
});
//POST Operation
app.post('/employee',(request, response)=>{
    console.log(request.body);
    let content= request.body;
    let p=request.params;
    let employee={id:p.id ,name:p.name, salary:p.salary};
    response.json(content);
});
//PUT Operation
app.put('/',(request,response)=>{
    let employee={name:"Shubham", age:27};
    response.json(employee);
   // response.send('PUT request from /');
});
//DELETE Operation
app.delete('/', (request,response)=>{
    let employee={name:"Shubham", age:27};
    response.json(employee);
    //response.send('DELETE request from /');
});
app.listen(port, () => console.log(`App is running on port ${port}`));