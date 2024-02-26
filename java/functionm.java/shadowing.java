public class shadowing {
    static int x = 90;    //THIS WILL  BE SHADOWED AT LINE 8 
    public static void main(String[] args) {
        System.out.println(x);   //90
        int x = 40;// THE CLASS VARIABLE AT LINE 4 IS SHADOWING BY THIS
        System.out.println(x);    // 40
        fun();
    }


    static void fun(){
        System.out.println(x);
    }
}
