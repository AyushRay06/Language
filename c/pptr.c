//POINTER TO POINTER : VARIABLE THAT STORES THE MEMORY ADDRESS OF ANOTHER POINTER 
#include<stdio.h>
int main(){
    int x ;
    int *ptr = &x;
    *ptr = 7;
    int **pptr = &ptr;

    printf("Value of X: %d\n",x);
    printf("VAlue of *ptr : %d\n",*ptr);
    printf("value of prt %u\n",ptr);
    printf("value of **pptr :%u\n",&**pptr);

}