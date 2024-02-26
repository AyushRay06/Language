# include<stdio.h>

//POINTER : IS A VARIABLE THAT STORE THE ADDRESS OF ANOTHER VARIABLE
int main(){
    int x;
    int *ptr = &x;
    *ptr =0;

    printf("Value of x is = %d\n",x);
    printf("Value of *ptr is = %d\n",*ptr);

    *ptr += 5;
    printf("Valuue of X is : %d\n",x);
    printf("Value of *ptr is: %d\n",*ptr);

    (*ptr)++;
    printf("Valuue of X is : %d\n",x);
    printf("Value of *ptr is: %d\n",*ptr);


    }