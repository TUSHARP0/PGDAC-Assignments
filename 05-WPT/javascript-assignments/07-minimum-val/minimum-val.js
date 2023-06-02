min=()=>{
    min = arr[0]
        for(var j=0; j<arr.length; j++){
            if(min>arr[j]){
                min = arr[j]
            }    
        }
    
    str = `<br>Smallest Value in your Numbers is: ${min}`

    document.getElementById("answer").innerHTML=str
}
arr = []
addNewNum=()=>{
    num = parseInt(document.getElementById("num").value)
    arr.push(num)
    document.getElementById("inputs").value= arr.toString()
    document.getElementById("num").value=""
    document.getElementById("num").focus()

}