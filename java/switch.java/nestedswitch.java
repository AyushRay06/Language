import java.util.*;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String superherouniverse = in.nextLine();
        String justice = in.nextLine();
        String AVENGERS = in.nextLine();

        
        System.out.println("Enter your Superhero");

        switch(superherouniverse){
            case "marvel":
                System.err.println("avengers");
                switch(AVENGERS){
                    case "Ironman":
                        System.out.println("i am iron man");
                        break;
                    case "captain":
                        System.out.println("i can do this all day");
                        break;    
                }

                break;
            case "DC":
                System.out.println("Justicelesgue");
                switch(justice){
                    case "superman":
                        System.out.println("supermann");
                        break;
                    case "batman":
                        System.out.println("iambatman");
                        break;
                    default:
                     System.out.println("enter valid superhero");

                }
                break;
                

        }

    }
}
