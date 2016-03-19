package ru.bakigoal.application;

import org.apache.log4j.Logger;
import ru.bakigoal.lib.Simple;

public class Main {
 private static final Logger LOG = Logger.getLogger(Main.class);

 public static void main(String[] args) {
  LOG.info("Application started");
  System.out.println("I'm the main project");
  Simple simple = new Simple();
  simple.setValue(10);
  System.out.println("Value from Simple: " + simple.getValue());
  LOG.info("Application finished");
 }
}
