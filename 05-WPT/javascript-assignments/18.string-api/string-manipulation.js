operate=()=>{
    str = document.getElementById("main_string").value
    sub_str = document.getElementById("sub_string").value
    rep_str = document.getElementById("rep_string").value
    var op = 0;
    
    //To retrieve selected radio button
    var arr = document.getElementsByName("operations");
    for (var i = 0; i < arr.length; i++) {
        if (arr[i].checked) {
            op = arr[i].value;
        }
    }
    
    switch(op){
        case "search":
            if (str.includes(sub_str)){
                document.getElementById("answer").innerHTML="<br>"+"Sub-string found"
            }
            
            else{
                document.getElementById("answer").innerHTML="<br>"+"Sub-string not found"
            }
            break;

            case "upper_case":
            ans = str.toUpperCase()
            document.getElementById("answer").innerHTML="<br>"+ ans
            break;

            case "lower_case":
            ans = str.toLowerCase()
            document.getElementById("answer").innerHTML="<br>"+ ans
            break;

            case "trim":
            ans = str.trim()
            document.getElementById("answer").innerHTML="<br>"+ ans
            break;

            case "concat":
            ans = str.concat(sub_str)
            document.getElementById("answer").innerHTML="<br>"+ ans
            break;

            case "replace":
            str = rep_str
            document.getElementById("main_string").value = str
            document.getElementById("answer").innerHTML="<br>"+ str
            break;

        }
    }