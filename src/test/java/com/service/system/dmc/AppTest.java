package com.service.system.dmc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppTest {

  @Autowired
  private App targetClass;

  @Test
  public void testGetCommnet() {
    assertEquals("welcome to detroit metal city!!", targetClass.getComment());
  }
}
