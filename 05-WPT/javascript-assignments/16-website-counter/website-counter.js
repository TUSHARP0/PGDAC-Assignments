const websites = [
    "www.google.com", "www.msn.com", "www.amazon.co.in", "in.answers.yahoo.com", "en.m.wikipedia.com", "codehs.gitbooks.io", "www.coderanch.com"
]

var counter=0;

const pattern = /^www/

for (let i=0; i<websites.length; i++){
    if (websites[i].startsWith("www")){
        counter++
    }
}

console.log(counter)