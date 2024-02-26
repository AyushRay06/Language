#include<stdio.h>
#include<math.h>
int main(){
    int num;
    printf("Enter the number you want the squre of: ");
    scanf("%d",&num);
    int sqr = pow(num,2);
    printf("The Square of the given number is: %d\n",sqr);
}