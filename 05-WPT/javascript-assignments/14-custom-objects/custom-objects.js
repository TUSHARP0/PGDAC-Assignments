var rectangle={length:10,widht:5};
var circle={radius:10};

function display(){
    var len= parseInt( rectangle.length);
    var wid= parseInt( rectangle.widht);
    var area=len*wid;
    var peri=2*(len+wid);
    var radius=parseInt(circle.radius);
    var c_area=(3.14*radius).toFixed(2);
    var c_peri=(2*3.14*radius).toFixed(2);
    document.getElementById('mydiv').innerHTML="Rectangle"+"<br>"+"Length : "+rectangle.length+"<br>"+" Width : "+rectangle.widht+"<br>"+" Area : "+area+"<br>"+" Perimeter : "+peri+"<br><br>";
    document.getElementById('mydiv1').innerHTML="Circle"+"<br>"+"Radius : "+circle.radius+"<br>"+" Area : "+c_area+"<br>"+" Perimeter : "+c_peri;
}