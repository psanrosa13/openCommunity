package com.paulasantana.opencommunity.project;

import java.util.Arrays;

public enum LanguageEnum {
  JAVA("Java"),
  C("C"),
  CPLUSPLUS("C++"),
  PYTHON("Python"),
  CSHARP("C#"),
  JAVASCRIPT("Java Script"),
  KOTLIN("Kotlin"),
  SWIFT("Swift"),
  OBJECTIVEC("Objective C"),
  GO("GO"),
  SCALA("Scala"),
  RUBY("Ruby"),
  RUST("Rust"),
  VBNET("VB .NET"),
  R("R"),
  PHP("PHP"),
  MATLAB("MATLAB");

  private String description;

  LanguageEnum(String description) {
    this.description = description;
  }

  public static boolean notContainsLanguage(String language){
    return Arrays.stream(LanguageEnum.values())
        .noneMatch(l -> l.description.toUpperCase().equals(language.toUpperCase()));
  }
}
