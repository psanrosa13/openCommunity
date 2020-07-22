package com.paulasantana.opencommunity.commons;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Person {

  @NotBlank
  private String name;

  @Email
  @NotBlank
  private String email;
}
