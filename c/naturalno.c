# include<stdio.h>
int main(){
    
    int num;
    printf("Enter your Number");
    scanf("%d",&num);
    if(num>0){
        printf("Natural Number");
    }else if(num<=0){
        printf("Not a natural number");
    }else{
        printf("Enter a valid number");
    }
}