import java.util.ArrayList;
import java.util.Arrays;

public class Arrayalist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
    
    list.add(76);
    list.add(45);
    list.add(870);
    list.add(56);
    list.add(84);
    list.add(02);
    System.out.println(list);

    list.set(1, 69);
    System.out.println(list);

    list.remove(0);
    System.out.println(list);
    
    }
    
}



