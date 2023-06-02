emparr = [];

for (var i = 0; i <= 5; i++) {
  var name = prompt(`Enter the name of employee ${i + 1}:`)
  emparr.push(name);
}

emparr.sort()

console.log("Employee Names:");
for (i = 0; i < emparr.length; i++) {
  console.log(emparr[i]);
}