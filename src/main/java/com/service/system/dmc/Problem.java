package com.service.system.dmc;

public class Problem {

  private int number;

  // 利用してない変数として指摘される
  private String type;

  // 利用してない変数として指摘される
  private String category;

  // 利用してない変数として指摘される
  private String comment;

  private int a;

  // 利用してない変数として指摘される
  private String b;

  // 利用してない変数として指摘される
  private String c;

  // 利用してない変数として指摘される
  private String d;

  public Problem(
      int number,
      String type,
      String category,
      String comment,
      int a,
      String b,
      String c,
      String d) {
    this.number = number;
    this.type = type;
    this.category = category;
    this.comment = comment;
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
  }
}
