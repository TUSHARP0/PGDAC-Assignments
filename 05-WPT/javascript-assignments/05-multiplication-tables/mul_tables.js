printTable=()=>{
    var num1=parseInt(document.getElementById("num").value)
    var str = `Table of ${num1}: <br><br> `

    for(var i=1; i<=10; i++){
        mul = num1*i
        str+= `${num1} X ${i} = ${mul} <br>`
    }
    document.getElementById("mul_tables").innerHTML+=str
}