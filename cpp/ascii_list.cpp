// Display all the ASCII characters 
#include <iostream> 
using namespace std; 
 
int main() { 
  for(int i = 0; i < 256; i = i + 1) {  
    if (i != 26){  // ANSI Terminal Clear screen 
      cout << " value: " << i  
           << " character: "  
           << char(i) // Type conversion
           << endl; 
    }
  }
}
