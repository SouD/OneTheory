package se.soud.onetheory;

import java.awt.EventQueue;

public class App {

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          OneTheory ot = new OneTheory();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

}
