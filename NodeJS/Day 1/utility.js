let util={
    store: function(name, age){
        console.log(`Stored ${name} with age ${age}`);
    },
    watch: function(viewside){
        console.log(`Stored ${viewside}`);
    }
}
module.exports=util