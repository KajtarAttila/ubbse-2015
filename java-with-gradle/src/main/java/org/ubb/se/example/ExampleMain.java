package org.ubb.se.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main entry point to example application.
 * Contains some log messages to include an outside dependency.
 * 
 * @author Csaba Sulyok
 */
public class ExampleMain {
  private static final Logger LOG = LoggerFactory.getLogger(ExampleMain.class);
  
  public static void main(String[] args) {
    LOG.warn("= Main entry point =");
    
    ExampleClass example = new ExampleClass();
    
    LOG.info("The {} is the word!", example.whatsTheWord());
  }
}
