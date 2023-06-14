greatestNumber = () =>{
num1 = parseInt(document.getElementById("num1").value)
num2 = parseInt(document.getElementById("num2").value)
num3 = parseInt(document.getElementById("num3").value)

    if(num1>=num2 && num1>=num3){
        alert("Greatest number is : " + num1)
    }

    if(num2>=num3 && num2>=num1){
        alert("Greatest number is : " + num1)
    }

    if(num3>=num2 && num3>=num1){
        alert("Greatest number is : " + num1)
    }

    document.getElementById("num1").value=""
    document.getElementById("num2").value=""
    document.getElementById("num3").value=""
}
