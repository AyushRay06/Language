public class recursion{
    public static void main(String[] args) {
        message();
    }

    static void message(){
        System.out.println("hellow world");
        message1();
    }

    static void message1(){
        System.out.println("hello world");
        message2();
    }

    static void message2(){
        System.out.println("hello world");
        message3();
    }
    

    static void message3(){
        System.out.println("hello world");
   }
}