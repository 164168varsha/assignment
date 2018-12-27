var fs=require("fs");
console.log("program strated");
var data=fs.readFileSync("data.txt");
console.log(data.toString());
console.log("program ended");