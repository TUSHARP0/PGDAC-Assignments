calc=()=>{
    num = parseInt(document.getElementById("num").value)
    pow = parseInt(document.getElementById("pow").value)
    ans=1
    while(pow!==0){
        ans *= num
        console.log(num)
        pow--
    }

    str=`<br> Answer: ${ans}`
    console.log(str)
    document.getElementById("answer").innerHTML=str
}