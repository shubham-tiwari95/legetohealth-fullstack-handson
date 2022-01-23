let http= require("http");
let url=require('url');
let port=9090
let Server= http.createServer((request,response)=>{
    //callback is executed when you get a request on 9090
    //setting the response and contents type so that it can understand html
    let urlobj=url.parse(request.url,true);
    console.log(urlobj.query.id,urlobj.query.pass);
    response.writeHead(200,{'content-type': 'text/html'});
    response.write(`<h3>This is a node web http app</h3>`);
    response.end(); //ending the response and sending it to client 
});

    Server.listen(port,()=>{
        console.log(`Server started on port:${port}`);
    });