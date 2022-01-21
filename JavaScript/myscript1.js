function validateForm(){
    var form= document.simpleForm;
    var user= form.un;
    var pass= form.pw;
    if(user.value.length < 1){
        alert("username can't be empty");
        return false;
    }
    if(pass.value.length < 1)
    {
        alert("Password can't be empty");
        return false;
    }
}