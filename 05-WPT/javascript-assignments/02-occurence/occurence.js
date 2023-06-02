prnt_ocr = () => {
    msg = document.getElementById("msg").value
    ocr = parseInt(document.getElementById("ocr").value)

    for (var i=0; i<ocr; i++){
        document.getElementById("prnt_ocr").innerHTML+=msg + "<br>"
    }
}