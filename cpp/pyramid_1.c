#include <stdio.h>

void main()
{
    int height, line, i;
    scanf("%d", &height);
    for (i = 0; i < height - 1; ++i)
        printf(" ");
    printf("1\n");
    for (line = 1; line < height; ++line)
    {
        for (i = 0; i < height - line - 1; ++i)
            printf(" ");
        for (i = 0; i < line; ++i)
            printf("%d", line + 1);
        printf(" ");
        for (i = 0; i < line; ++i)
            printf("%d", line + 1);
        printf("\n");
    }
}
