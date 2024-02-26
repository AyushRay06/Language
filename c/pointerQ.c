#include<stdio.h>

void doCal(int a,int b, int *sum, int *product, int *average);
int main(){
    int a ,b,sum,product,average;
    printf("ENter the value of 1st number: ");
    scanf("%d",&a);

    printf("Enter the value of 2nd number: ");
    scanf("%d",&b);

    doCal(a,b ,&sum, &product, &average);
    printf("Sum = %d, Product = %d,Average = %d",sum,product,average);

}

void doCal(int a,int b,int *sum,int *product,int *average){
    *sum = a+b;
    *product = a*b;
    *average = (a+b)/2;
}