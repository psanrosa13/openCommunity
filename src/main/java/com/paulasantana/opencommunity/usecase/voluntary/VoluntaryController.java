package com.paulasantana.opencommunity.usecase.voluntary;

import com.paulasantana.opencommunity.usecase.project.LanguageEnum;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voluntarys")
public class VoluntaryController {

  @Autowired
  VoluntaryService voluntaryService;

  @PostMapping
  public Voluntary create(@Valid Voluntary voluntary) {
    return voluntaryService.create(voluntary);
  }

  /**
   * Consulta de voluntarios.
   *
   * @param page     paginação da consulta
   * @param language filtro por linguagem
   * @return
   */
  @GetMapping
  public List<Voluntary> consultList(Pageable page,
                                     @RequestParam(name = "language") String language) {
    if (LanguageEnum.notContainsLanguage(language)) {
      throw new IllegalArgumentException("Language is not valid");
    }
    return voluntaryService.consultList(page, language);
  }
}
