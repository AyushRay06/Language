import java.util.*;

public class Conditions{
    //LOOPS ANS INPUT PARACTICE
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // CONDITIONS FOR DEFINING ADULTS
        int age = input.nextInt();
        if(age>18){
            System.out.println("Your are an adult");
        }else{
            System.out.println("Your are not an adult Fuck off");
        }


        //CONDITIONS FOR FINDING EEN OR ODD NUMBER
        System.out.println("ENTER YOUR NUMBER");
        int num = input.nextInt();
        // % <- is call Modulo it give the remaider since 2 /even no gives remainer 0 
       
        if(num % 2 == 0){
            System.out.println("EVEN NUMBER");
        }  else if (num == 0){
            System.out.println("NUMBER IS ZERO");
        }else{
            System.out.println("ODD NUMBER");
        }

        //CONDITION FOR COMPARISION OF TWO NUMBERS(using float because it can do intiger work as wellas decimals)
        float a = input.nextFloat();
        float b = input.nextFloat();

        if(a>b){
            System.out.println("a IS GREATER THAN b");
        }else if (a == b){
            System.out.println("a IS EQUALE TO b");
        }else{
            System.out.println("a is lesser than b");
        }

        }
} 
