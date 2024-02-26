let x;  
document.getElementById("play").onclick = function(){
    x = Math.floor(Math.random()*7);
    

    document.getElementById("xlable").innerHTML = x; 
}

