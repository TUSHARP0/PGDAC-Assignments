printEvenNumbers = () => {
    num = parseInt(document.getElementById("num").value)

    while (num>0){
        if(num%2 == 0){
            document.getElementById("prnt_even_nums").innerHTML += num + " "
        }
        num--
    }
}