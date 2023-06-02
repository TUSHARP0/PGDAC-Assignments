sumOfDigits=()=>{
    num = parseInt(document.getElementById("num").value)
    sum=0

    while(num>0){
        digit = num%10
        sum += digit
        num = num/10
    }
    sum = Math.trunc(sum)
    str = `<br>Sum of the digits of your number is: ${sum}`
    document.getElementById("answer").innerHTML= str
}