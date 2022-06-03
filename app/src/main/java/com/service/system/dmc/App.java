package com.service.system.dmc;

public class App {

  public static void main(String[] args) {
    Problem problem = new Problem("world", "hello");
    System.out.println(problem.getComment() + " " + problem.getCategory());
  }
}
