members=["Abdul", "Tushar", "Mohan", "Pranay", "Mohan", "Rushikesh"]

displayNames=()=>{
    str = "Members of my Group are: <br>"

    for (var i=0; i<members.length; i++){
        str += members[i].toUpperCase() + ", "
    }
    str = str.slice(0,str.length-2)
    document.getElementById("main").innerHTML=str
}