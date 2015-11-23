package org.ubb.se.example;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * A few unit tests for ExampleClass.
 * 
 * @author Csaba Sulyok
 */
public class ExampleClassTest {

  private ExampleClass example;

  @Before
  public void initialize() {
    example = new ExampleClass();
  }

  @Test
  public void whatsTheWordTest() {
    String theWord = example.whatsTheWord();
    assertThat("bird", is(theWord));
  }

  @Test
  public void isTheWordCorrect() {
    boolean result = example.isTheWord("bird");
    assertThat(result, is(true));
  }

  @Test
  public void isTheWordCorrectCasesAndTrim() {
    boolean result = example.isTheWord("  BIrD  ");
    assertThat(result, is(true));
  }

  @Test
  public void isTheWordInCorrect() {
    boolean result = example.isTheWord("not the bird");
    assertThat(result, is(false));
  }

}
