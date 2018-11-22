#include <iostream>

using namespace std;

int main()
{
    int in, wait;
    
    cout<<"Enter : "<<endl;
    cin>>in;
    
    switch(in)
    {
              case 1:
                   cout<<"Inside 1"<<endl;
                   break;
              case 2:
                   cout<<"Inside 2"<<endl;
              case 3:
                   cout<<"Inside 3"<<endl;
              default:
                   cout<<"Inside default"<<endl;
    }
    
    cin>>wait;
    return 0;
}



