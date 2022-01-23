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
    }
    console.log("DONE");
});
