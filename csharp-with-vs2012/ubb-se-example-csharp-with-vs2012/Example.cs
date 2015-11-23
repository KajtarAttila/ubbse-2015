using System;

namespace UbbSeExample
{
  /**
   * Example class to demonstrate automatic testing and Jenkins reports using C Sharp and MSTest.
   * @author Csaba Sulyok
   */
  public class Example
  {
    private const string THE_WORD = "bird";

    public string WhatsTheWord()
    {
      return THE_WORD;
    }

    public bool IsTheWord(string referenceWord)
    {
      return THE_WORD.Equals(referenceWord.ToLower().Trim());
    }
  }

  class MainClass
  {
    static void Main(string[] args)
    {
      Example e = new Example();
      System.Console.WriteLine(e.WhatsTheWord());
      System.Console.WriteLine(e.IsTheWord("vird"));
      System.Console.WriteLine(e.IsTheWord("bird"));
    }
  }
}
