package com.service.system.dmc;

public class Problem {

  private int number;

  // 利用してない変数として指摘される
  private String type;

  // 利用してない変数として指摘される
  private String category;

  // 利用してない変数として指摘される
  private String comment;

  public Problem(int number, String type, String category, String comment) {
    this.number = number;
    this.type = type;
    this.category = category;
    this.comment = comment;
  }

  public int getNumber() {
    return this.number;
  }
  public String getComment() {
    return this.comment;
  }
  public String getCategory() {
    return this.category;
  }
}
