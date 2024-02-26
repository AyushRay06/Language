
// break = breaks out of a loop entirely
// continue = skip an iteration of a loop


// Continue
/*
for(let i = 0; i<=50;i++){
    if(i == 11){
        continue;
    }
    console.log(i);
}


//Break

for(let a=100;a>=50;a--){
    if(a==69){
        break;
    }
    console.log(a);
}











//function = Define code once, and use it many times.
//                   To perform some code, call the function name.

startProgram();

function startProgram(){
    let userName = "Bro";
    let age = 21;
    
    happyBirthday(userName, age);
}

function happyBirthday(userName, age){
    console.log("Happy birthday to you!");
    console.log("Happy birthday to you!");
    console.log("Happy birthday dear", userName);
    console.log("Happy birthday to you!");
    console.log("You are", age,"years old!");
}
*/

/*Javascript array tutorial example explained

// array = think of it as a variable, 
//             that can store multiple values

let fruits = ["apple", "orange", "banana"];

//fruits[2] = "coconut";

//fruits.push("lemon");   //add an element
//fruits.pop();           //removes last element
//fruits.unshift("mango");//add element to beginning
//fruits.shift();         //removes element from beginning

//let length = fruits.length;
//let index = fruits.indexOf("kiwi");

console.log(fruits);
*/



















let area;
let width;
let height;

width = window.prompt("Enter your width");
height= window.prompt("enter your height");


 area = getArea(width,height);

 console.log("area : " ,area);
function getArea(width, height){
    return width*height
}





















// ternary operator = Shortcut for an 'if/else statement'
//                    Takes 3 operands
 
//                    1. a condition with ?
//                    2. expression if True :
//                    3. expression if False
 
// condition ? exprIfTrue : exprIfFalse








// 2D array = An array of arrays

let fruits =           ["apples", "oranges", "bananas"];
let vegetables = ["carrots", "onions", "potatoes"];
let meats =         ["eggs", "chicken", "fish"];

let groceryList = [fruits, vegetables, meats];

groceryList[2][2] = "steak";

for(let list of groceryList){
    for(let food of list){
        console.log(food);
    }
}











// spread operator = allows an iterable such as an 
// ...                             array or string to be expanded 
//                                 in places where zero or more 
//                                 arguments are expected
//                                 (unpacks the elements)

let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let maximum = Math.max(...numbers);
console.log(maximum);

/*
let class1 = ["Spongebob", "Patrick", "Sandy"];
let class2 = ["Squidward", "Mr.Krabs", "Plankton"];
class1.push(...class2);
console.log(...class1);
*/
