public class recusionsmpl {
    public static void main(String[] args) {
        //print first 5 no using recursion
        print(1);
    }

    static void print(int n){
// base statment to make the recursion loop stop or else the stack memory will get full and give error after certain  no 
        if ( n==5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        print(n+1);

    }
}
