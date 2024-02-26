#include<stdio.h>

void table(int n);

int main(){
    int n;
    printf("Enter the number for which you want to print the table: ");
    scanf("%d",&n);
    table(n);
    
}

void table(int n){
    for(int i=1;i<=10;i++){
        printf("%d\n",i*n);
    }
}