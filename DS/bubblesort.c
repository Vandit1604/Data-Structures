#include <stdio.h>
void main()
{
    int arr[99];
    int n, num;
    printf("Enter The Number of Elements You Want : ");
    scanf("%d", &n);

    // inputting the array
    for (int i = 0; i < n; i++)
    {
        printf("Enter The %d Element : ", i + 1);
        scanf("%d", &arr[i]);
    }

    // bubblesort
    int temp = 0;
    for (int j = 0; j < n; j++)
    {
        for (int i = 0; i < n - j - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
    }

    // printing the array
    for (int i = 0; i < n; i++)
    {
        printf("Array[%d]=%d\n", i, arr[i]);
    }
}