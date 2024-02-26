#include<stdio.h>

int sum(int a,int b);


int main(){
    int a,b;
    printf("Enter the First number : ");
    scanf("%d",&a);
    printf("Enter the value of second number : ");
    scanf("%d",&b);

    int s = sum(a, b);
    printf("The sum of the two numbers are: %d",s);
    return 0;
}

int sum(int a, int b){
    return a + b;
}
