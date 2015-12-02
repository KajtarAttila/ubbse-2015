package org.ubb.se.example;

/**
 * Example class to demonstrate automatic testing and Jenkins reports using Java
 * & Maven.
 * 
 * @author Csaba Sulyok
 */
public class ExampleClass {

  private static final String THE_WORD = "bird";

  public String whatsTheWord() {
    return THE_WRD;
  }

  public boolean isTheWord(String referenceWord) {
    return THE_WORD.equalsIgnoreCase(referenceWord.trim());
  }
}
