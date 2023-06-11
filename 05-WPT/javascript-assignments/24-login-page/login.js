function validateInfo(){
    var u=document.getElementById('unm').value;
    var p=document.getElementById('pwd').value;
    var flag1=validateUser(u);
    var flag2=validatePass(p);
    if(flag1 && flag2){
        document.getElementById('mydiv').innerHTML="Welcome";
        document.getElementById('page').style.display= 'none';
    }
}
function validateUser(user){
    var pattern=/^[A-Za-z]+$/;
    if(user.trim()!=="" && pattern.test(user)){
        if(user.length>6 && user.length<10){
            document.getElementById('err1').innerHTML="";
            return true;
        }else{
            document.getElementById('err1').innerHTML="Usersname should be between 6 and 10 characters";
            return false;
        }
    }
    document.getElementById('err1').innerHTML="Invalid usersname";
    return false;
}
function validatePass(password){
    var patt = /^(?=.*\d)(?=.*#).{8,}$/;
    if(password.trim()!=='' && patt.test(password)){
        if(password.length>8){
            document.getElementById('err2').innerHTML="";
            return true;
        }else{
            document.getElementById('err2').innerHTML="Password cannot be less than 8 characters";
            return false;
        }
    }else{
        document.getElementById('err2').innerHTML="Invalid password";
        return false;
    }
}