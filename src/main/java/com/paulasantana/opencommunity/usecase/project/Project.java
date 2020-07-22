package com.paulasantana.opencommunity.usecase.project;

import com.paulasantana.opencommunity.commons.Person;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
  private Person responsible;

  @NotBlank
  @Enumerated(EnumType.STRING)
  private LanguageEnum language;

  @Min(value = 300)
  @NotBlank
  private String description;

  private String site;

  private String github;

  private String otherContact;

}
