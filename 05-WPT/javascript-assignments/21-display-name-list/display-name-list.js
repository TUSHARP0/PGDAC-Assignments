members=["Abdul", "Tushar", "Mohan", "Pranay", "Mohan", "Rushikesh"]

displayNames=()=>{
    list = document.getElementById("list")

    for (var i=0; i<members.length; i++){
        li = document.createElement("li")
        li.innerText = members[i]
        list.appendChild(li)
        
    };
}
