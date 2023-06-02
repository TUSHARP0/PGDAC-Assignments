mathOps = () => {
    num1 = parseInt(document.getElementById("num1").value)
    num2 = parseInt(document.getElementById("num2").value)

    var op = document.getElementById("ops")
    var pos = op.selectedIndex
    var calc = op.options[pos].value 
    var ans

    switch(calc){
        case "add":
            ans = 0
            ans = num1 + num2
            break;

        case "sub":
            ans = 0
            ans = num1 - num2
            break;

        case "mul":
            ans = 0
            ans = num1 * num2
           break;

        case "div":
            ans = 0
            ans = num1 / num2
            break;
    }
    document.getElementById("ans").value = ans
}