#include<stdio.h>

// sum of n number using Recurssion!
int sum(int num);

int main(){
    int n,num;
    printf("Enyter the value of n: ");
    scanf("%d",&n);
    printf("the sum of n no is: %d",sum(num));

}

int sum(int num){
    if(num==1){
        return 1;
    }
    int sumN = sum(num-1);
    int summ = sumN + num;
    return summ;
}