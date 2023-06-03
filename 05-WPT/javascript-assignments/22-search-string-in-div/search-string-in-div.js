searchString=()=>{
    str = document.getElementById("str").value;

    div1 = document.getElementById("div1");
    div2 = document.getElementById("div2");
    div3 = document.getElementById("div3");
    div4 = document.getElementById("div4");
    div5 = document.getElementById("div5");
    div6 = document.getElementById("div6");
    div7 = document.getElementById("div7");
    div8 = document.getElementById("div8");
    div9 = document.getElementById("div9");

    ans = "The following divisions contain your string: <br>"
    
    if(div1.innerHTML.includes(str)){
        ans += "div1 <br>"
    }

    if(div2.innerHTML.includes(str)){
        ans += "div2 <br>"
    }

    if(div3.innerHTML.includes(str)){
        ans += "div3 <br>"
    }
    
    if(div4.innerHTML.includes(str)){
        ans += "div4 <br>"
    }

    if(div5.innerHTML.includes(str)){
        ans += "div5 <br>"
    }

    if(div6.innerHTML.includes(str)){
        ans += "div6 <br>"
    }

    if(div7.innerHTML.includes(str)){
        ans += "div7 <br>"
    }

    if(div8.innerHTML.includes(str)){
        ans += "div8 <br>"
    }

    if(div9.innerHTML.includes(str)){
        ans += "div9 <br>"
    }

    console.log(ans)

    document.getElementById("answer").innerHTML = ans
}
