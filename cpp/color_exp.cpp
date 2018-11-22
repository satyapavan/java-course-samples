/****************************
 * Author: Zach Rogers
 * http://zachr.co.cc
*****************************/
#include <iostream>
#include <string>

using namespace std;

class ColorIO
{
    public:
    void Write(string Text, string TextColor, string BackColor);
    void WriteLine(string Text, string TextColor, string BackColor);
};

class ConsoleColor
{
    public:
    void ForegroundColor(string Color);
    void BackgroundColor(string Color);
    void Reset();
};

void ColorIO::Write(string Text, string TextColor, string BackColor)
{
    int TextColorNum = 0;
    int BackColorNum = 0;

    if(TextColor == "Black")
    {
        TextColorNum = 30;
    }
    else if(TextColor == "Red")
    {
        TextColorNum = 31;
    }
    else if(TextColor == "Green")
    {
            TextColorNum = 32;
    }
    else if(TextColor == "Yellow")
    {
            TextColorNum = 33;
    }
    else if(TextColor == "Blue")
    {
            TextColorNum = 34;
    }
    else if(TextColor == "Magenta")
    {
            TextColorNum = 35;
    }
    else if(TextColor == "Cyan")
    {
            TextColorNum = 36;
    }
    else if(TextColor == "White")
    {
            TextColorNum = 37;
    }

    if(BackColor == "Black")
    {
            BackColorNum = 40;
    }
    else if(BackColor == "Red")
    {
            BackColorNum = 41;
    }
    else if(BackColor == "Green")
    {
            BackColorNum = 42;
    }
    else if(BackColor == "Yellow")
    {
            BackColorNum = 43;
    }
    else if(BackColor == "Blue")
    {
            BackColorNum = 44;
    }
    else if(BackColor == "Magenta")
    {
            BackColorNum = 45;
    }
    else if(BackColor == "Cyan")
    {
            BackColorNum = 46;
    }
    else if(BackColor == "White")
    {
            BackColorNum = 47;
    }


    cout << "\033[0;" << TextColorNum << "m";//Change Text Color
    cout << "\033[1;" << BackColorNum << "m";//Change Background Color
    cout << Text;

    cout << "\033[0m";//Changes Terminal To Default Color(Text and Background)
}

void ColorIO::WriteLine(string Text, string TextColor, string BackColor)
{
    int TextColorNum = 0;
    int BackColorNum = 0;

    if(TextColor == "Black")
    {
        TextColorNum = 30;
    }
    else if(TextColor == "Red")
    {
        TextColorNum = 31;
    }
    else if(TextColor == "Green")
    {
            TextColorNum = 32;
    }
    else if(TextColor == "Yellow")
    {
            TextColorNum = 33;
    }
    else if(TextColor == "Blue")
    {
            TextColorNum = 34;
    }
    else if(TextColor == "Magenta")
    {
            TextColorNum = 35;
    }
    else if(TextColor == "Cyan")
    {
            TextColorNum = 36;
    }
    else if(TextColor == "White")
    {
            TextColorNum = 37;
    }

    if(BackColor == "Black")
    {
            BackColorNum = 40;
    }
    else if(BackColor == "Red")
    {
            BackColorNum = 41;
    }
    else if(BackColor == "Green")
    {
            BackColorNum = 42;
    }
    else if(BackColor == "Yellow")
    {
            BackColorNum = 43;
    }
    else if(BackColor == "Blue")
    {
            BackColorNum = 44;
    }
    else if(BackColor == "Magenta")
    {
            BackColorNum = 45;
    }
    else if(BackColor == "Cyan")
    {
            BackColorNum = 46;
    }
    else if(BackColor == "White")
    {
            BackColorNum = 47;
    }


    cout << "\033[0;" << TextColorNum << "m";//Change Text Color
    cout << "\033[1;" << BackColorNum << "m";//Change Background Color
    cout << Text << endl;

    cout << "\033[0m";//Changes Terminal To Default Color(Text and Background)
}

void ConsoleColor::ForegroundColor(string Color)
{
    string TextColor = Color;
    int TextColorNum = 0;

    if(TextColor == "Black")
    {
        TextColorNum = 30;
    }
    else if(TextColor == "Red")
    {
        TextColorNum = 31;
    }
    else if(TextColor == "Green")
    {
            TextColorNum = 32;
    }
    else if(TextColor == "Yellow")
    {
            TextColorNum = 33;
    }
    else if(TextColor == "Blue")
    {
            TextColorNum = 34;
    }
    else if(TextColor == "Magenta")
    {
            TextColorNum = 35;
    }
    else if(TextColor == "Cyan")
    {
            TextColorNum = 36;
    }
    else if(TextColor == "White")
    {
            TextColorNum = 37;
    }
    cout << "\033[0;" << TextColorNum << "m";//Change Text Color
}

void ConsoleColor::BackgroundColor(string Color)
{
    string BackColor = Color;
    int BackColorNum = 0;

    if(BackColor == "Black")
    {
            BackColorNum = 40;
    }
    else if(BackColor == "Red")
    {
            BackColorNum = 41;
    }
    else if(BackColor == "Green")
    {
            BackColorNum = 42;
    }
    else if(BackColor == "Yellow")
    {
            BackColorNum = 43;
    }
    else if(BackColor == "Blue")
    {
            BackColorNum = 44;
    }
    else if(BackColor == "Magenta")
    {
            BackColorNum = 45;
    }
    else if(BackColor == "Cyan")
    {
            BackColorNum = 46;
    }
    else if(BackColor == "White")
    {
            BackColorNum = 47;
    }
    cout << "\033[1;" << BackColorNum << "m";//Change Background Color
}

void ConsoleColor::Reset()
{
    cout << "\033[0m";//Changes Terminal To Default Color(Text and Background)
}

int main()
{
   ConsoleColor objConsoleColor;
   objConsoleColor.ForegroundColor("Red");

   ColorIO objColorIO;
   objColorIO.WriteLine("PAVAN", "Red", "Blue");

   return 0;
}
