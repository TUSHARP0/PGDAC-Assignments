displayWeekday=()=>{
    const weekday = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"]
    date = new Date("2023-06-01")
    day = weekday[date.getDay()]

    return day
}

console.log(displayWeekday())