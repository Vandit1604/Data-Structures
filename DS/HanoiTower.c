#include <stdio.h>
int TH(int n, char A, char B, char C)
{
    if (n == 0)
    {
        return 1;
    }
    TH(n - 1, A, C, B);
    printf("%d disk moves from %c to %c \n", n, A, B);
    TH(n - 1, C, B, A);
}
void main()
{
    TH(7, 'A', 'B', 'C');
}