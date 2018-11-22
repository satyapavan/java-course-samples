#include <iostream>
#include <conio.h>

using namespace std;

int b = 8;

static int c  = 6;

int main()
{
    auto int a;
    a = 9;
    
    static int d = 5;
    
    cout<<"Local/Auto"<<endl;
    cout<<"a:"<<a<<endl;
    cout<<"&a:"<<&a<<endl;

    cout<<"Global"<<endl;
    cout<<"b:"<<b<<endl;
    cout<<"&b:"<<&b<<endl;

    cout<<"Global Static"<<endl;
    cout<<"c:"<<c<<endl;
    cout<<"&c:"<<&c<<endl;

    cout<<"Local Static"<<endl;
    cout<<"d:"<<d<<endl;
    cout<<"&d:"<<&d<<endl;

    getch();
}
