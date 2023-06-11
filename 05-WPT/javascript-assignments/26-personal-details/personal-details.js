var f=[];
function populateYear(){
    var selectyear=document.getElementById('yyyy');
    for(var i=1930;i<=2023;i++){
    var option=document.createElement('option');
    option.value=i;
    option.text=i;
    selectyear.appendChild(option);
}
}
function populateDay(){
    var selectday=document.getElementById('dd');
    for(var j=1;j<=31;j++){
    var option=document.createElement('option');
    option.value=j;
    option.text=j;
    selectday.appendChild(option);
    }
}

window.onload=function(){
    populateDay();
    populateYear();
};

function sendData(){
    var name=document.getElementById('nm').value;
    var month=document.getElementById('mm').value;
    var day=document.getElementById('dd').value;
    var year=document.getElementById('yyyy').value;
    var mail=document.getElementById('email').value;
    var gender=document.getElementsByName('gender');

    
    
    for(var i=0;i<gender.length;i++){
        if(gender[i].checked){
            var g=gender[i].value;
            break;
        }
    }
    var luck= parseInt(document.getElementById('lucky').value);
    var food= document.getElementsByName('food');

    for(var j=0; j<food.length; j++){
        if(food[j].checked){
            f.push(food[j].value);
        }
    }
    var flag1=validateName(name);
    var flag2=validateDate(year,month,day);
    var flag3=validateMail(mail);
    var flag4=validateGender(gender);
    var flag5=validateNumber(luck);
    var flag6=validateFood(food);
    alert(flag1+" "+flag6+" "+flag2+" "+flag3+" "+flag4+" "+flag5)
    if(flag1 && flag2 && flag3 && flag4 && flag5 && flag6){
        document.getElementById('mydiv').innerHTML="You entered :"+"<br>"+
    "Name : "+name+"<br>"+"Birth Date :"+month+"/"+day+"/"+year+"<br>"+"Email :"+mail+"<br>"+
    "Gender : "+g+"<br>"+"Lucky number : "+luck+"<br>"+"Favorite Food : "+f.join(",");
    }   
}
function validateName(name){
    if(name.trim()!=='' && isNaN(name)){
        document.getElementById('err1').innerHTML='';
        return true;
    }else{
        document.getElementById('err1').innerHTML='Enter valid name';
        return false;
    }
}
function validateNumber(num){
    if(num!=='' && !isNaN(num)){
        if(num>1 && num<100){
            document.getElementById('err5').innerHTML='';
            return true;
        }else{
            document.getElementById('err5').innerHTML='Enter number between 1 and 100';
            return false;
        }
        
    }else{
        document.getElementById('err5').innerHTML='Enter valid number';
        return false;
    }
}
function validateGender(gender){
    for(var i=0;i<gender.length;i++){
        if(gender[i].checked){
            document.getElementById('err4').innerHTML='';
            return true;
        }else{
            document.getElementById('err5').innerHTML='Select Gender';
            return false;
        }
    }
}
function validateMail(mail){
    var pattern=/^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if(pattern.test(mail)){
        document.getElementById('err3').innerHTML="";
        return true;
    }else{
        document.getElementById('err3').innerHTML="Enter valid email";
        return false;
    }
}
function validateFood(food){
    var isChecked=false;
    for(var j=0; j<food.length; j++){
        if(food[j].checked){
            isChecked=true;
            break;
        }
    }
    if(isChecked){
        document.getElementById('err6').innerHTML="";
        return true;
    }else{
        document.getElementById('err6').innerHTML="Select at least one";
        return false;
    }
}
function validateDate(year, month, day) {
var selectedMonth = document.getElementById('mm').selectedIndex;
var selectedDay = document.getElementById('dd').selectedIndex;
var selectedYear = document.getElementById('yyyy').selectedIndex;

if (selectedMonth === 0 || selectedDay === 0 || selectedYear === 0) {
    document.getElementById('err2').innerHTML = 'Select a valid date';
    return false;
} else {
document.getElementById('err2').innerHTML = '';
return true;
}
}