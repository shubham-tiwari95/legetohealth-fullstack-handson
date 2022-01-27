let app = require("express")();
let MongoClient = require("mongodb").MongoClient;
let url = "mongodb://localhost:27017"
let port = 9094;

app.listen(port,() => {console.log(`Node is running on port ${port}`)});

app.get("/employee/:id",(request,response)=>{
        let empId = parseInt(request.params.id); 

        //convert to MongoDB db -> MongoClient.connect(url,parser,callback)
        MongoClient.connect(url,{useNewURLParser:true},(err,client) => {
            if(!err){
                let x =0 ;
                let db = client.db("myDb");
                
                let doc = db.collection("employee").find({_id:empId});

               
                doc.forEach((record) => {
                    x++;
                    response.send(record);
                },() => {
                    if(x==0){
                        response.json({error : "Id "+empId+" not found in Collection Employee"})
                    }
                    client.close();
                }) 

            }
        }) 

app.get("/employee",(request,response) => {
    MongoClient.connect(url,{useNewURLParser : true},(err,client) => {
        if(!err){
            let x = 0;
            let db = client.db("myDb");
            let employeesArr = []
            let doc = db.collection("employee").find();
            console.log("Inside mongoclient employee/")
            doc.forEach((record) => {
                x++;
                employeesArr.push(record)
            },() => {
                if(x==0){
                    response.json({error : "Employee collection is empty"})
                }else{
                    response.json(employeesArr)
                }
            })
        }
    })

}) 


})