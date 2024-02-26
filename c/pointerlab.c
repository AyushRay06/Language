# include<stdio.h>
int main(){
    int a;
    int *ptr = &a;
    *ptr = 10;
    printf("the value of a is: %d",*ptr);

}