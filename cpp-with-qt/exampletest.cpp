/* Since unit test class, only include if TEST macro defined */
#ifdef TEST

#include "exampletest.h"
#include <QString>


void TestExampleClass::whatsTheWordTest() {
  const QString theWord = example.whatsTheWord();
  QVERIFY("bird" == theWord);
}

void TestExampleClass::isTheWordCorrect() {
  bool result = example.isTheWord(QString("bird"));
  QVERIFY(result);
}

void TestExampleClass::isTheWordCorrectCasesAndTrim() {
  bool result = example.isTheWord(QString("  BIrD  "));
  QVERIFY(result);
}

void TestExampleClass::isTheWordInCorrect() {
  bool result = example.isTheWord(QString("not the bird"));
  QVERIFY(!result);
}

#endif
