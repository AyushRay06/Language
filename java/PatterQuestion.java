public class PatterQuestion {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(4);
        pattern3(9);
        pattern4(5);
        pattern5(9);
        pattern6(6);
    }
    static void pattern1( int n){
        for(int row =1; row<=n; row++){
            for(int col = 1; col <= n ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row = 1; row<=n; row++){
            for (int col=1; col<=row; col++){
                System.out.print("* ");
            }
            //when one rpw is printed we need to add a line
            // or else it will print in a stright line horizontaly
            // and if add syso() our side the for loop for row it will print on a stright line vericaly as it will be of no use

            System.out.println();
        }
       

    }


    static void pattern3(int n){
        for(int row = 1; row<=n;row++){
            for(int col = n; col>=row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 1; row<=n; row++){
            for(int col = 1; col<=row; col++){
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int row =1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

}
