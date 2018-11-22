#include <stdio.h>

int main()
{
    int height = 0;
    printf("Enter the Height of Pyramid: ");
    
    scanf("%d",&height);
    
    int i = 0;
    int counter = 1;

    for( i=1; i <= height; ++i)
    {
        int k = height;
        int j = 1;

        for( ; k >= i; --k )
        {
            printf("  ");
        }

        for( ; j <= i; ++j, ++counter )
        {
            printf("%2d  ",counter);
        }

        printf("\n");
    }

    printf("\n");
}
