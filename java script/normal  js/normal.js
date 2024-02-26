//const

// const PI = 3.14;
// let radius;
// let circumference;
// radius = window.prompt("Enter your radius");
// // we are converting radius into number as input are always taken in String
// radius = Number(radius);
// circumference= 2 * PI *radius;
// console.log("the cicunference of your circule is", circumference);



















// math

// let x = 24;
// let y = 64.97;
// let z = -42;
// let maximun;
// let minimum;
// maximum = Math.max(x, y, z);
// minimum = Math.min(z,y,z);
// console.log(maximum);
// console.log(minimum);
//  y = Math.floor(y);
// console.log(y)












// hypotenious problem

let a;
let b;
let c;

a = window.prompt("Enter side a");
a =Number(a);
b = window.prompt("Enter side b");
b = Number(b);

c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
console.log(c);
















// strings and properties
// useful string properties & methods

let userName = "Bro Code";
let phoneNumber = "123-456-7890";

//console.log(userName.length);
//console.log(userName.charAt(0));
//console.log(userName.indexOf("o"));
//console.log(userName.lastIndexOf("o"));
//userName = userName.trim();
//userName = userName.toUpperCase();
//userName = userName.toLowerCase();

phoneNumber = phoneNumber.replaceAll("-", "");

console.log(phoneNumber);

       //STRING SLICING//

// slice() extracts a section of a string 
//             and returns it as a new string, 
//             without modifying the original string

let fullName = "Snoop Dogg";
let firstName;
let lastName;

//firstName = fullName.slice(0, 3);
//lastName = fullName.slice(4);

firstName = fullName.slice(0, fullName.indexOf(" "));
lastName = fullName.slice(fullName.indexOf(" ") + 1);

console.log(firstName);
console.log(lastName);
















// method chaining = calling one method after another
//                   in one continuous line of code

let useName = "bro";

let letter = useName.charAt(0).toUpperCase().trim();

console.log(letter);

















//checked and radio button//
document.getElementById("myButton").onclick = function(){

    const myCheckBox = document.getElementById("myCheckBox");
    const visaBtn = document.getElementById("visaBtn");
    const mastercardBtn = document.getElementById("mastercardBtn");
    const paypalBtn = document.getElementById("paypalBtn");
  
    if(myCheckBox.checked){
      console.log("You are subscribed!");
    }
    else{
      console.log("You are NOT subscribed!");
    }
  
    if(visaBtn.checked){
      console.log("You are paying with a Visa!");
    }
    else if(mastercardBtn.checked){
      console.log("You are paying with a Mastercard!");
    }
    else if(paypalBtn.checked){
      console.log("You are paying with PayPal!");
    }
    else{
      console.log("You must select a payment type!");
    }
  }
















  
Pinned by Bro Code
Bro Code
1 year ago (edited)
// Template literals = delimited with (`)
//                                   instead of double or single quotes
//                                   allows embedded variables and expressions

let userName = "Bro";
let items = 3;
let total = 75;

//console.log("Hello", userName);
//console.log("You have", items, "items in your cart");
//console.log("Your total is $", total);

//console.log(`Hello ${userName}`);
//console.log(`You have ${items} items in your cart`);
//console.log(`Your total is $${total}`);

let text = 
`Hello ${userName}<br>
You have ${items} items in your cart<br>
Your total is $${total}<br>`;

//console.log(text);
document.getElementById("myLabel").innerHTML = text;
/*
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <label id="myLabel"></label>
    <script src="index.js"></script>
</body>
</html>

*/

  