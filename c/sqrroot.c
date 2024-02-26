#include <stdio.h>
#include <math.h>

int main() {
    double x, sqrt_x;
    printf("Enter a number: ");
    scanf("%lf", &x);
    sqrt_x = sqrt(x);
    printf("The square root of %lf is %lf", x, sqrt_x);
    return 0;
}
