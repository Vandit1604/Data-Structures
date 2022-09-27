#include <iostream>
using namespace std;
int main()
{
    int n, m, i = 0, j = 0, k = 0, s;
    cout << "Enter The Number of Elements in first array:" << endl;
    cin >> n;
    int arr1[n];
    cout << "Enter The Number of Elements in second array:" << endl;
    cin >> m;
    int arr2[m];
    s = n + m;
    int arr3[s];

    cout << "Enter The Value in First Array" << endl;
    for (i = 0; i < n; i++)
    {
        cout << "Enter The Value of " << i + 1 << " Element:" << endl;
        cin >> arr1[i];
    }
    cout << "Enter The Value in Second Array" << endl;
    for (j = 0; j < m; j++)
    {
        cout << "Enter The Value of " << j + 1 << " Element:" << endl;
        cin >> arr2[j];
    }

    i = 0, j = 0, k = 0;
    while (i < n && j < m)
    {
        if (arr1[i] > arr2[j])
        {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        // else if (arr1[i] == arr2[j])
        // {
        //     arr3[k] = arr1[i];
        //     i++;
        //     j++;
        //     k++;
        // }
        else
        {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
    }
    while (i < n)
    {
        arr3[k] = arr1[i];
        i++;
        k++;
    }
    while (j < m)
    {
        arr3[k] = arr2[j];
        j++;
        k++;
    }
    cout << "*******************************" << endl;
    cout << "Sorted-Merged Array is" << endl;
    for (i = 0; i < k; i++)
    {
        cout << arr3[i] << endl;
    }

    return 0;
}