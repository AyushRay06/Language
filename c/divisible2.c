#include<stdio.h>
#include<math.h>
int main(){
    int num;
    printf("enter the number : ");
    scanf("%d",&num);

    if("%d",num % 2 ==0){
        printf("The number is divisible by 2");
    }else{
        printf("The number given is not divisible by 2");
    }
    return 0;
}
