#include "exampletest.h"

/* Since unit test class, only include if TEST macro defined */
#ifdef TEST

void TestExampleClass::whatsTheWordTest() {
  const QString theWord = example.whatsTheWord();
  QCOMPARE("bird", theWord);
}

void TestExampleClass::isTheWordCorrect() {
  bool result = example.isTheWord("bird");
  QVERIFY(result);
}

void TestExampleClass::isTheWordCorrectCasesAndTrim() {
  bool result = example.isTheWord("  BIrD  ");
  QVERIFY(result);
}

void TestExampleClass::isTheWordInCorrect() {
  bool result = example.isTheWord("not the bird");
  QVERIFY(!result);
}

#endif
