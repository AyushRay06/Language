import java.util.*;

public class Variable {
  public static void main(String[] args) {
    //VARIABLE AND INPUTS
    Scanner input = new Scanner(System.in);
    // EITHER sc or input can be use 
    int a =  input.nextInt();
    int b =  input.nextInt();
    
    int sum = a + b;
    System.out.println(sum);
    System.out.println(a - b);
    int product = a * b;
    System.out.println(product);
    // we can directly print result like line 8 or by creating another variabl like line 6&7
    double divide = a / b;
    System.out.println(divide);
  }
}
