package com.paulasantana.opencommunity.project;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank
  private String name;

  @NotBlank
  @Enumerated(EnumType.STRING)
  private LanguageEnum language;

  @NotBlank
  private String responsible;

  @Email
  @NotBlank
  private String email;

  @Min(value = 300)
  @NotBlank
  private String description;

  private String site;

  private String github;

  private String otherContact;
}
