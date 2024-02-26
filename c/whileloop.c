#include<stdio.h>
int main(){
    int x, y;
    printf("Enter your counter initiater : ");
    scanf("%d",&x);
    printf("Enter the Deadend : ");
    scanf("%d",&y);
    while(x<=y){
        printf("%d\n",x);
        x++;
    }
}