#include <stdio.h>
#include <string.h>
#include <conio.h>

main()
{
    ////////////////////////////////////////////////////

    double a = 15.5;
    double b = (double)31/2;

    if( a == b )
        printf("\nTrue");
    else
        printf("\nFalse");

    printf("\n a=[%f]", a);
    printf("\n b=[%f]",b);

    /*
      op:
               True
                a=[15.500000]
                b=[15.500000]
    */
    
    ////////////////////////////////////////////////////

    char s1[]="hello";
    char s2[]="hello";

    printf("\ns1=[%s]", s1);
    printf("\ns2=[%s]", s2);

    if( s1 == s2)
        printf("\ntrue\n");
    else
        printf("\nFalse");

    /*
      op:
                s1=[hello]
                s2=[hello]
                False
                // because it points to the address, which are different
    */
    ////////////////////////////////////////////////////

    int x=5, y=2;
    printf("\n%d", x+++y);

    int l=5;
    printf("\n%d-%d-%d", ++l, l, l++);

    l=1;
    printf("\n%d-%d-%d", ++l, l++, ++l);

    /*
      op:
                 7
                 7-6-5
                 4-2-2
    */
    ////////////////////////////////////////////////////

    int z = 2;

    if ( z = 2 || 3 )
        printf("\nInside If:: z=[%d]", z);
    else
        printf("\nInside else:: z=[%d]", z);

    if ( z = 0 || 0 )
        printf("\nInside If:: z=[%d]", z);
    else
        printf("\nInside else:: z=[%d]", z);
        
    /*
      op:
                  Inside If:: z=[1]
                  Inside else:: z=[0]
    */
    ////////////////////////////////////////////////////

    printf("\n%d", printf("\nINDIA"));

    /*
      op:
                   INDIA
                   6
    */
    ////////////////////////////////////////////////////

    char c1[]="EDUCATION";
    char c2[]="INFOSYS";

    strncpy(c1, c2, 4);
    printf("\nc1=[%s]", c1);
    printf("\nc2=[%s]", c2);

    strcpy(c1, c2);

    printf("\nc1=[%s]", c1);
    printf("\nc2=[%s]", c2);

    /*
      op:
                  c1=[INFOATION]
                  c2=[INFOSYS]
                  c1=[INFOSYS]
                  c2=[INFOSYS]
    */
    ////////////////////////////////////////////////////
    
    int iNumber1=-1, aiArray[100];
    
    do
    {
        printf("\niNumber1[%d]", iNumber1);
        iNumber1 = iNumber1 + 1;
        printf("\nEnter something: ");
        scanf("%d", &aiArray[iNumber1]);
    } while(iNumber1 < 10);
    
    ////////////////////////////////////////////////////
    printf("\n");
    getch();
}
