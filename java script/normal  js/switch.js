let marks = 90;

switch(marks){
    case marks <=95:
        console.log("motherfucker u did great but get a life");
        break;

    case marks<=85:
        console.log("u did great great how's life");
        break;
    
    case marks<=70:
        console.log("good");
        break;
     
    case marks<= 60:
        console.log("try hard");
        break;
    
        default:
            console.log("mf u failed");



}













// = assignment operator
// == comparison operator
// === strict equality operator

let x = "3.14";

if(x === 3.14){
    console.log("That is pi");
}
else{
    console.log("That is NOT pi");
}














// Gives us the ability to check more than 1 condition concurrently
// && AND (BOTH conditions must be true)
// || OR (Either condition can be true)

let temp = 15;
let sunny = false;

if(temp > 0 && temp < 30 && sunny){
    console.log('The weather is good!');
}
else{
    console.log('The weather is bad!');
}










// ! NOT logical operator
// typically used to reverse a condition's boolean value
// true -> false  false -> true

/*let temp = 15;
let sunny = false;

if(!(temp > 0)){
    console.log("It's cold outside");
}
else{
    console.log("It's warm outside");
}

if(!sunny){
    console.log("It's cloudy outside");
}
else{
    console.log("It's sunny outside");
}
*/











//while loop = repeat some code 
//              while some condition is true
//              potentially infinite

let userName = "";

while(userName == "" || userName == null){
    userName = window.prompt("Enter your name");
}

console.log("Hello", userName);


















// do while loop = do something,
//                             then check the condition,
//                             repeat if condition is true

/*let userName;

do{
    userName = window.prompt("Enter your name");
}while(userName == "")

console.log("Hello", userName);*/













// for loop = repeat some code a 
//            certain amount of times
/*
for(let i = 1; i <= 10; i+=1){
    console.log(i);
}
*/
for(let i = 10; i > 0; i-=1){
    console.log(i);
}

console.log("HAPPY NEW YEAR!");