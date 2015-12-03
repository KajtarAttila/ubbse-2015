#pragma once

/* Since unit test class, only include if TEST macro defined */
#ifdef TEST

#include <QtTest/QtTest>
#include "example.h"

/**
 * A few unit tests for ExampleClass.
 *
 * @author Csaba Sulyok
 */
class TestExampleClass : public QObject
{
  Q_OBJECT

private:
  ExampleClass example;

private slots:
  void whatsTheWordTest();
  void isTheWordCorrect();
  void isTheWordCorrectCasesAndTrim();
  void isTheWordInCorrect();

};

#endif
