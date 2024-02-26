import java.util.Arrays;

public class variablelengtharguments {
    public static void main(String[] args) {
       //basicaly prints the string
       
        fun( 12,3,3,5,6,7,8,9);
        sun( "dick","sick","jon","cena");
        multipal(1,2,"abcdefghijklmnopqrstuvwxyz");
 
    }
    

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void sun(String...s){
        System.out.println(Arrays.toString(s));
    }

    
    static void multipal(int a, int b, String...m){
        System.out.println(Arrays.toString(m));
    }



}

