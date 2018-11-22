#include <iostream>
#include <conio.h>

using namespace std;

class rctor
{
    public:

    rctor(){
            cout<<"Inside ctor()"<<endl;
            rctor obj;
    }
    
    ~rctor(){
             cout<<"Inside dtor()"<<endl;
    }
};

int main()
{
    { rctor obj; }
    getch();
    return 0;
}
