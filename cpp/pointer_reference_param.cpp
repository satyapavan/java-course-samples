#include <iostream>
#include <conio.h>

using namespace std;

void fun_pointer(int *a);
void fun_reference(int &a);

int main()
{
    int *a;
    int b = 5;
    
    a = &b;
    
    cout<<"main:pointer  :value  :"<<*a<<endl;
    cout<<"main:pointer  :address:"<<a<<endl;
    cout<<"main:reference:value  :"<<b<<endl;
    cout<<"main:reference:address:"<<&b<<endl<<endl;

    cout<<"Pointer->Pointer"<<endl;
    fun_pointer(a);

    cout<<"NormalObj->Pointer"<<endl;
    fun_pointer(&b);
    
    cout<<"Pointer->Reference"<<endl;
    fun_reference(*a);
    
    cout<<"NormalObj->Reference"<<endl;
    fun_reference(b);
    getch();
}

void fun_pointer(int *a)
{
    cout<<"fun_pointer:value  :"<<*a<<endl;
    cout<<"fun_pointer:address:"<<a<<endl;
    cout<<endl;
}

void fun_reference(int &a)
{
    cout<<"fun_reference:value  :"<<a<<endl;
    cout<<"fun_reference:address:"<<&a<<endl;
    cout<<endl;
}
