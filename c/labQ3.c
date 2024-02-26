//print the factorial of a number using recursion
#include <stdio.h>

int factorial(int n) {
    if (n == 0) {
        return 1;
    } else {
        return n * factorial(n-1);
    }
}

int main() {
    int num, result;
    printf("Enter a positive integer: ");
    scanf("%d", &num);
    result = factorial(num);
    printf("%d! = %d\n", num, result);
    return 0;
}
