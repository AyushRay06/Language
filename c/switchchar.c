# include<stdio.h>
int main(){
    char days;
    printf("Enter the initials of the Day : ");
    scanf("%s",&days);

    switch(days){
        case 's':
            printf("Today is Sunady");
            break;
        case 'm':
            printf("Today is Sunady");
            break;
        case 't':
            printf("Today is Sunady");
            break;
        case 'w':
            printf("Today is Wednesday");
            break;
        case 'h':
            printf("Today is Thrusday");
            break;
        case 'f':
            printf("Today is RCB ki ma ki chut");
            break;
        case 'a':
            printf("Alyways is RCB randi");
            break;
        default:
            printf("Enter a valid Character");
            break;
    }
}