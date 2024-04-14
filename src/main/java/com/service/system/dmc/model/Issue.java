package com.service.system.dmc.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Issue implements Serializable {

  private int number;
  private String type;
  private String category;
  private String comment;
}
