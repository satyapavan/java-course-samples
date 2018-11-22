#include<iostream>
#include <conio.h>

using namespace std;
class A
{
    public:
    A()
    {
        cout << __PRETTY_FUNCTION__ << endl;
    }
};
int main()
{
    A aa();

    getch();
    return 0;
}
