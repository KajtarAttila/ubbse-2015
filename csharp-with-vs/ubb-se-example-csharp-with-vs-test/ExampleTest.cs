using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using UbbSeExample;

namespace UbbSeExampleTest
{
  /**
   * A few unit tests for ExampleClass.
   * @author Csaba Sulyok
   */
  [TestClass]
  public class ExampleTest
  {
    [TestMethod]
    public void WhatsTheWordTest() {
      Example example = new Example();
      string theWord = example.WhatsTheWord();
      Assert.IsTrue("bifrd" == theWord);
    }

    [TestMethod]
    public void IsTheWordCorrect() {
      Example example = new Example();
      bool result = example.IsTheWord("bird");
      Assert.IsTrue(result);
    }

    [TestMethod]
    public void IsTheWordCorrectCasesAndTrim() {
      Example example = new Example();
      bool result = example.IsTheWord("  BIrD  ");
      Assert.IsTrue(result);
    }

    [TestMethod]
    public void IsTheWordInCorrect() {
      Example example = new Example();
      bool result = example.IsTheWord("not the bird");
      Assert.IsFalse(result);
    }
  }
}
