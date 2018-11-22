#include <stdio.h>
#include <stdlib.h>
#include <conio.h>

enum
{
   KEY_ESC = 27,
   ARROW_UP = 256 + 72,
   ARROW_DOWN = 256 + 80,
   ARROW_LEFT = 256 + 75,
   ARROW_RIGHT = 256 + 77
};

static const char *menu_options[] = {
   "Option 1",
   "Option 2",
   "Option 3"
};
static const int menu_size = 3;

int get_code(void)
{
   int ch = getch();

   if (ch == 0 || ch == 224)
       ch = 256 + getch();

   return ch;
}

void menu(int arrow)
{
   int i;

   for (i = 0; i < menu_size; i++) {
       if (i == arrow)
           printf(" --> ");
       else
           printf(" ");
       printf("%s\n", menu_options[i]);
   }
}

int main(void)
{
   int action;
   int arrow = 0;

   menu(arrow);
   while ((action = get_code()) != KEY_ESC) {
       switch (action) {
       case ARROW_UP:
           if (--arrow < 0)
              arrow = menu_size - 1;
           break;
       case ARROW_DOWN:
           if (++arrow == menu_size)
               arrow = 0;
           break;
       case '\r':
           printf("Executing %s...\n", menu_options[arrow]);
           printf("Done, press any key to continue...");
           get_code();
           break;
       default:
           break;
       }
       system("cls");
       menu(arrow);
   }

   return 0;
}
