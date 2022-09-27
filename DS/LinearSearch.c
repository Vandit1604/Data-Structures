#include <stdio.h>

void LinearSearch(int SizeOfArray, int arr[SizeOfArray], int NumberYouWantToSearch)
{
    int i = 0;
    while (SizeOfArray > i)
    {
        if (NumberYouWantToSearch == arr[i])
        {
            printf("The Element is At Position %d ", i);
            break;
        }
        else
        {
            i++;
        }
    }
}

void LinearSearch(int SizeOfArray, int arr[SizeOfArray], int NumberYouWantToSearch)
{
}

int main()
{
    int n, num;
    printf("Enter The Number of Elements You Want : ");
    scanf("%d", &n);
    int arr[n];

    // inputting the array
    for (int i = 0; i < n; i++)
    {
        printf("Enter The %d Element : ", i + 1);
        scanf("%d", &arr[i]);
    }

    // asking the user for number you want to search for
    printf("Enter The Element You Want To Search : \n");
    scanf("%d", &num);

    // Linear Search
    LinearSearch(n, arr, num);

    // binary search
    BinarySearch()
}
