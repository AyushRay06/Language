
alert("hello")
const answer =Math.floor(Math.random()* 100 + 1);
let guesses = 0;

document.getElementById("submitbtn").onclick= function(){
    let Guess = document.getElementById("guess").value
    guesses+=1;

    if(Guess==answer){
        alert("The answer was "+answer +", your guess is correct, it took you "+ guesses+ " guesses");
    }
    else if(Guess<answer){
        alert("To small just like your dick");
    }
    else{
        alert("to big");
    }
}