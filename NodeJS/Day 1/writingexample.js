fs= require('fs');
let text= "This is the text I want to write in the file";
fs.writeFileSync('dummy.txt',text,{flag: 'a+'});
console.log("DONE!");