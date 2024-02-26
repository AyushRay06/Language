import java.util.*;


public class switchnew {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String superhero = in.nextLine();

        switch(superhero){
            case "Ironman" -> System.out.println("Suck my dick");
            case "Captain" -> System.out.println("I CAN DO THIS ALL DAY");
            case "hulk" -> System.out.println("GREEN POOP");
        }


        int day = in.nextInt();


        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }

        switch(day){
            case 1,2,3,4,5 ->System.out.println("weekday");
            case 6,7 ->System.out.println("weekend");
        }
        
    }
}
