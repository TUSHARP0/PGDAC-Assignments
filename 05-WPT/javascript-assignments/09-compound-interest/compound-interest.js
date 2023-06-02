calcCompInt=()=>{
    amt = parseInt(document.getElementById("amt").value)
    time = parseInt(document.getElementById("time").value)
    int = parseInt(document.getElementById("int").value)

    compint = amt*(Math.pow((1+int/100),time))-amt 
    compint = Math.round(compint)
    str=`Compound Interest : ${compint}`

    document.getElementById("answer").innerHTML="<br>" + str
}