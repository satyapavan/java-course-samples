#include <iostream>
#include <conio.h>

using namespace std;

void fun(int a);
void funn(const int &a);

int main()
{
    const int a = 5;
    
    fun(a);
    funn(a);

   getch();
}

void fun(int a){ }

void funn(const int &a){ }
