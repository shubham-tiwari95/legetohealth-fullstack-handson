fs= require('fs')
fs.readFile('./users.json',(err, jsonData) => {
    if(err){

        console.log('Some Error in if block' + err);
    }
    else{
        console.log('Inside else block');
        let users=JSON.parse(jsonData);
        users.forEach(obj => {
            Object.entries(obj).forEach(([key,value])=>{
                console.log(`${key}--${value}`);
            });
                console.log("--------------------");
        });
        var newObject={"name":"Shubham","age":27}
        var newObject2={"name":"Sanjeet","age":26}
        users.push(newObject);
        users.push(newObject2);

        fs.writeFile('./users.json',JSON.stringify(users),function(err){
        if(err)
        throw err;
    })
    }
});
    
