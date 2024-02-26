public class patternQagain{
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        // pattern5(5);
        pattern6(4,5);
        pattern7(5);
        pattern8(5);
        pattern9(10, 1);
        pattern10(5);
    }


    static void pattern1(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

    static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print( " ^");
            }
            System.out.println(" ");
        }
    }


    static void pattern3(int n ){
        for(int i = 1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" #");
            }
            System.out.println(" ");
        }
    }

    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print( j + " ");
            }
            System.out.println(" ");
        }
    }

    /*static void pattern5(int n){
        for(int i=1;i<=n;i++){
            if( j<=5){
                for(int j=1;j<=i;j++){
                    System.out.println(" ^");
                }
            }else{
                for(int j=1;j<=i;j--){
                    System.out.println(" ^");
                }
            }
            System.out.println(" ");
        }
    }
*/
    static void pattern6(int n, int m){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if( i==1 || j==1|| i==n|| j==m ){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    static void pattern7(int n){
        //outer lop 
        for(int i =1;i<=n;i++){
            //inner loop for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
                }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=n-i+1;j--){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

    static void pattern9(int n ,int number){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number + " ");
                number++;

            }
            System.out.println(" ");
        }
    }

    static void pattern10(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(" 1");
                }else{
                    System.out.print(" 0");
                }
            }

            System.out.println();
        }
    }
}
