operate=()=>{
    str = document.getElementById("main_string").value
    sub_str = document.getElementById("sub_string").value
    ep_str = document.getElementById("rep_string").value

    var op = document.getElementsByName("operations").value
    switch(op){
        case "search":
            search=()=>{
                if (str.includes(sub_str)){
                 document.getElementById("answer").innerHTML="<br>"+"Sub-string found"
                }
                else{
                 document.getElementById("answer").innerHTML="<br>"+"Sub-string not found"
                }
             }
             break;

        case "upper_case":
            upperCase=()=>{
                ans = str.toUpperCase()
                document.getElementById("answer").innerHTML="<br>"+ ans
            
            }
            break;

        case "lower_case":
            lowerCase=()=>{
                ans = str.toLowerCase()
                document.getElementById("answer").innerHTML="<br>"+ ans
            }
            break;

        case "trim":
            trim=()=>{
                ans = str.trim()
                document.getElementById("answer").innerHTML="<br>"+ ans
            }
            break;

        case "concat":
            concat=()=>{
                ans = str.concat(sub_str)
                document.getElementById("answer").innerHTML="<br>"+ ans
            }
            break;

        case "replace":
            replace=()=>{
                str = rep_str
                document.getElementById("main_string").value = str
                document.getElementById("answer").innerHTML="<br>"+ str
            }
            break;

    }
}