function sumOfDigits(){
    num = parseInt(document.getElementById("num").value)
    sum = 0

    if (num<1 || num>1000){
        str = "Number out of range"
        document.getElementById("sol").value = str
    }
    else{
        
        while(num>0){
            digit = num%10
            sum += digit
            num /= 10
        }
        sum = Math.trunc(sum)
        str = `${sum}`
        document.getElementById("sol").value = str
    }
}