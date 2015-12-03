#include "example.h"

const QString ExampleClass::theWord = QString("bird");

const QString& ExampleClass::whatsTheWord() {
  return theWord;
}

bool ExampleClass::isTheWord(const QString referenceWord) {
  return QString::compare(theWord, referenceWord.trimmed(), Qt::CaseInsensitive) == 0;
}
