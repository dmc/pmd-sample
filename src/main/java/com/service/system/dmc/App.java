package com.service.system.dmc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

  @Value("${spring.app.comment}")
  private String comment;

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  public String getComment() {
    return comment;
  }
}
