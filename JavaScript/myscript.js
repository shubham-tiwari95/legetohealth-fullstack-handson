function validateForm(){
    var form = document.simpleForm;
    var user = form.un;
    var pass = form.pwd;
    if(user.value.length < 1){
    alert("Username cannot be empty");
    return false;
    }
    if(pass.value.length < 1){
    alert("Password cannot be empty");
    return false;
    }
    //return true;
    }