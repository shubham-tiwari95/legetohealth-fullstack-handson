let fs = require('fs');
let data= fs.readFileSync("dummy.txt");
let content= data.toString();
console.log(content);