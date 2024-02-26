#include<stdio.h>

float areaSqr(int side);
float areaRec(int a, int b);
float areaCir(int radius);

int main(){
    int side,radius,a,b;
    printf("enter the side of the square: ");
    scanf("%d",&side);
    printf("Area of square is: %f\n",areaSqr(side)); 

    printf("Enetr the sides of the rectrangle: ");
    scanf("%d""%d",&a,&b);
    printf("Area of rectrangle is: %f\n",areaRec(a,b));

    printf("enter the radius of the circle: ");
    scanf("%d",&radius);
    printf("Area of circle is: %f\n",areaCir(radius)); 

    return 0;

}

float areaSqr(int side){
    return side*side;
}

float areaRec(int a,int b){
    return a*b;
}

float areaCir(int radius){
    return 3.14*radius*radius;
}