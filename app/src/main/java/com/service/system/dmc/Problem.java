package com.service.system.dmc;

public class Problem {

  private int number;

  private String type;

  private String category;

  private String comment;

  public Problem(String type, String comment) {
    this.category = category;
    this.comment = comment;
  }

  public String getComment() {
    return this.comment;
  }
  public String getCategory() {
    return this.category;
  }
}