
let app = require("express")();


let http = require("http").Server(app)


let io = require("socket.io")(http)


app.get("/",(request,response) => {
    response.sendFile(__dirname+"/clientSocket.html");
})

http.listen(9090,() => {
    console.log("server running on port 9090")
})


io.on("connection",(socket) => {
    console.log("Client is connected to the server : "+socket.connected)
    
    socket.on("clientMessage",(msg) => {
        console.log(msg)
        socket.emit("messageKey",msg)
    })

})