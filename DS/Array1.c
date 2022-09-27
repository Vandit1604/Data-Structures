#include <stdio.h>
void main()
{
    int arr[99], n, i, sum = 0, max, min;

    printf("*************Taking Inputin Array*************\n");
    printf("Enter The Number of Elements in array\n");
    scanf("%d", &n);
    printf("Enter The Elements of The Array\n");
    for (i = 0; i < n; i++)
    {
        printf("Enter The %d Element : ", i + 1);
        scanf("%d", &arr[i]);
    }

    printf("*************Displaying The Array*************\n");
    for (i = 0; i < n; i++)
    {
        printf("The %d Element is : ", i + 1);
        printf("%d\n", arr[i]);
    }

    printf("*************Sum of The Array*************\n");
    for (i = 0; i < n; i++)
    {
        sum = sum + arr[i];
    }
    printf("Sum of Array Elements is : %d\n", sum);

    printf("*************Maximum Element of The Array*************\n");
    for (i = 0; i < n; i++)
    {
        max = arr[0];
        if (max <= arr[i])
        {
            max = arr[i];
        }
    }
    printf("Maximum element is %d\n", max);

    printf("*************Minimum Element of The Array*************\n");
    for (i = 0; i < n; i++)
    {
        min = arr[0];
        if (min >= arr[i])
        {
            min = arr[i];
        }
    }
    printf("Minimum element is %d\n", min);

    // printf("*************Repeated Elements of The Array*************\n");
    // int f[99];
    // int count = 1;
    // for (i = 0; i < n; i++)
    // {
    //     for (int j = i + 1; j < n; j++)
    //     {
    //         arr[i] == arr[j];
    //         count++;
    //         -++
    //     }
    // }
}
