#include "example.h"

/**
 * Compile test executions if TEST macro is defined.
 */
#ifdef TEST

#include "exampletest.h"
QTEST_MAIN(TestExampleClass)
//#include "testexampleclass.moc"


/**
 * Use real main if TEST macro not defined.
 */
#else

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

#endif
