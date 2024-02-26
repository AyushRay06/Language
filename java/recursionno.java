public class recursionno {
    public static void main(String[] args) {
        // wriete a function that takes in a number and print it
        //print first 5 number: 12345
        function(1);
    }

    static void function(int n){
        System.out.println(n);
        function1(2);
    }

    static void function1(int n){
        System.out.println(n);
        function2(3);
    }

    static void function2(int n){
        System.out.println(n);
        function3(4);
    }

    static void function3(int n){
        System.out.println(n);
        function4(5);
    }

    static void function4(int n){
        System.out.println(n);
    }
    
}
