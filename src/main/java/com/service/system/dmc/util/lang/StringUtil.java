package com.service.system.dmc.util.lang;

import java.util.Arrays;
import java.util.List;

public class StringUtil {
  public static String join(String[] array, String joiner) {
    return join(Arrays.asList(array), joiner);
  }

  public static String join(List<String> list, String joiner) {
    return String.join(joiner, list);
  }
}
