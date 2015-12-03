#include "example.h"
#include <QApplication>
#include <QMessageBox>

int main(int argc, char *argv[])
{
  QApplication app(argc, argv);
  
  ExampleClass example;
  
  QMessageBox::information(0,
    "UBBSE Qt Example",
    "The " + example.whatsTheWord() + " is the word!");
}
