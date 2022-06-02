package com.service.system.dmc;

public class App {

  public static void main(String[] args) {
    Problem problem = new Problem(1, "world", "category", "hello");
    System.out.println(problem.getComment() + " " + problem.getCategory());
  }
}
