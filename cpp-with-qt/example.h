#pragma once

#include <QString>

/**
 * Example class to demonstrate automatic testing and Jenkins reports using C++ and Qt
 * @author Csaba Sulyok
 */
class ExampleClass {

public:
  const QString& whatsTheWord();
  bool isTheWord(const QString referenceWord);

private:
  static const QString theWord;
  
};
