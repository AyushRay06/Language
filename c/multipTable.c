#include<stdio.h>
int main(){
    int num, i;
    printf("Enter the Number for which you want to print the table : ");
    scanf("%d",&num);

    for(i=num;i<=5;i++){
        printf("%d\n",num,"x",i,"=");
    }
}