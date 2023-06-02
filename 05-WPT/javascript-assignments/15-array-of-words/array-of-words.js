const words = [
    "Ahad","Tushar","Pranay","Mohit","Kunal"
]

 for (let i=0; i<words.length; i++){
    var splitWord = words[i].split("")
    var reverseWord = splitWord.reverse()
    var finallWord = reverseWord.join("")
    words[i] = finallWord
    }

words.sort();

for (let i=0; i<words.length; i++){
    console.log(words[i])
}