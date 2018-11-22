#include <iostream>
#include <conio.h>

using namespace std;

int main()
{
    enum shape {
         circle=1,
         square,
         line=2
    };
    
    cout<<"circle:"<<circle<<endl;
    cout<<"square:"<<square<<endl;
    cout<<"line  :"<<line<<endl;

    getch();
}
