calCCircumference=()=>{
    radius = parseInt(document.getElementById("rad").value)
    circumference = Math.round(2*Math.PI*radius)
    
    area = Math.round(Math.PI*(Math.pow(radius,2)))

    str = `Area of Circle ~ ${area} <br>Circumference of Circle ~ ${circumference}`
    document.getElementById("answer").innerHTML += str
}