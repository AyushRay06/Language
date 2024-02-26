# include<stdio.h>
int main(){
    int age;
    printf("Enter your Age: ");
    scanf("%d",&age);

    if(age< 18){
        printf("You are a chid");
    }else if((age<=18)&&(age>=59)){
        printf("Yor are an adult");
    }else{
        printf("You are old");
    }
} 