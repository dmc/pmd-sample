package com.service.system.dmc.util.lang;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StringUtilTest {
  @Test
  public void testJoin() {
    assertEquals("apple,amazon", StringUtil.join(new String[] {"apple", "amazon"}, ","));
  }

  @Test
  public void testJoin2() {
    List<String> list = new ArrayList<>();
    list.add("apple");
    list.add("amazon");
    assertEquals("apple,amazon", StringUtil.join(list, ","));
  }
}
