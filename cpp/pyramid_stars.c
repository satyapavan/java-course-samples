#include <stdio.h>

main()
{
    int j=5;

    int i=1;
    for (i=1;i<=5;i++)
    {
        int k=1;
        for (k=1;k<=j;k++)
        {
            printf(" ");
        }

        int x=1;
        for (x=1;x<=i;x++)
        {
            printf("* ");
        }
        printf("\n");
        j=j-1;
    }
    getch();
}
