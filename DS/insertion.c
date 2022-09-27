#include <stdio.h>
int main()
{
    int arr[99];
    int n, num, pos;
    printf("Enter The Number of Elements You Want : ");
    scanf("%d", &n);

    // inputting the array
    for (int i = 0; i < n; i++)
    {
        printf("Enter The %d Element : ", i + 1);
        scanf("%d", &arr[i]);
    }

    // printing the array
    for (int i = 0; i < n; i++)
    {
        printf("Array[%d]=%d\n", i, arr[i]);
    }

    printf("Enter The Position You Want To Insert at :  ");
    scanf("%d", &pos);
    printf("Enter The Element You Want To Insert :  ");
    scanf("%d", &num);

    for (int i = n + 1; i > pos; i--)
    {
        arr[i] = arr[i - 1];
    }

    arr[pos] = num;
    // printing array
    for (int i = 0; i < n + 1; i++)
    {
        printf("Element at Position %d is : %d\n ", i, arr[i]);
    }

    return 0;
}