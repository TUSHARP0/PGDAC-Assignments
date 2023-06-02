displayCurrDate=()=>{

    const date = new Date();
    const weekday = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]
    const months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]
    str = "Today is "+ weekday[date.getDay()] + ", " + date.getDate() + " " + months[date.getMonth()] + " " + date.getFullYear() + ", Welcome, and "
    
    if(date.getHours() < 12){
        str += "Good Morning to you"
    }

    if(date.getHours() >=12 && date.getHours() < 16){
        str += "Good Afternoon to you"
    }

    if(date.getHours() >= 16 && date.getHours() < 21){
        str += "Good Evening to you"
    }

    else{
        str += "Good Night to you"
    }

    const refDate = new Date("2023-12-31")
    diff = Math.abs(refDate-date)
    diff = Math.ceil(diff/(1000*60*60*24))
    str += "\nNumber of Day left till end of year: " + diff

    return str
}

console.log(displayCurrDate())