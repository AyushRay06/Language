import java.util.*;



public class switchkk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String superhero = in.next();

        switch(superhero){
            case "Ironman":
                System.out.println("Iam Ironman");
                break;
            case "Captain":
                System.out.println("I CAN DO THIS ALL DAY");
                break;
            case "Thor":
                System.out.println("GOD OF THUNDER");
                break;
            case "Hulk":
                System.out.println("HULK SMASH");
                break;
            default:
                System.out.println("please enter a valid superhero");    
        }

        //another more clean SWITCH syntax in next file

    }
}
