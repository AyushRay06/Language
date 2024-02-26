let temp;
answer = 0;
answer = Number(temp);


function tocelsius(temp){
    return (temp - 32)*(5/9);
}

function toferenhit(temp){
    return (temp*9)/(5+32);
}
document.getElementById("submitbtn").onclick = function(){
    if(document.getElementById("cbutton").checked){
        temp = document.getElementById("temp").value
        document.getElementById("answer").innerHTML = tocelsius(temp) + "\u00B0C";
    }
    else if(document.getElementById("fbutton").checked){
        temp = document.getElementById("temp").value;
        document.getElementById("answer").innerHTML = toferenhit(temp) +"\u00B0F";
    }
    else{
        document.getElementById("answer").innerHTML = "Select an Option";
    }
}