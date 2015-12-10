package org.ubb.se.example;

/**
 * Example class to demonstrate automatic testing and Jenkins reports using Java
 * & Gradle.
 * 
 * @author Csaba Sulyok
 */
public class ExampleClass {

  private static final String THE_WORD = "bird";

  public String whatsTheWord() {
    return THE_WORD;
  }

  public boolean isTheWord(String referenceWord) {
    return THE_WORD.equalsIgnoreCase(referenceWord.trim());
  }
}
