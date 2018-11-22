#include <iostream>
#include <conio.h>

using namespace std;

int main()
{
    int a[] = { 5, 2, 4, 6, 1, 3 };

    printf("\nUnSorted array is ");
    for( int i = 0; i < 6; ++i )
    {
         printf("%d ", a[i]);
    }

    for( int i = 1; i < 6; ++i )
    {
         printf("\nOuter loop i[%d]",i);
         int key = a[i];
         int j = i-1;
         while( (j >= 0) && (a[j] > key) )
         {
                    printf("\n");
                    for( int z = 0; z < 6; ++z )
                    {
                          printf("%d ", a[z]);
                    }

                printf("\nInner loop i[%d]::j[%d]",i,j);
                a[j+1] = a[j];
                --j;
         }
         a[j+1] = key;
    }
    
    printf("\nSorted array is ");
    for( int i = 0; i < 6; ++i )
    {
         printf("%d ", a[i]);
    }
    getch();
}
