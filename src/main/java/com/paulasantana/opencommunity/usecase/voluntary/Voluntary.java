package com.paulasantana.opencommunity.usecase.voluntary;

import com.paulasantana.opencommunity.commons.Person;
import com.paulasantana.opencommunity.usecase.project.LanguageEnum;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Voluntary extends Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotBlank
  @Enumerated(EnumType.STRING)
  List<LanguageEnum> interests;
}


