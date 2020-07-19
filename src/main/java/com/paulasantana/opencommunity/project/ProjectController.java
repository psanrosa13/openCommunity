package com.paulasantana.opencommunity.project;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectController {

  @Autowired
  ProjectService projectService;

  @PostMapping
  public Project create(@Valid Project project) {
    return projectService.create(project);
  }

  @GetMapping("/{id}")
  public Project consult(@PathVariable long id) {
    return projectService.consultById(id);
  }

  @DeleteMapping("/{id}")
  public void exclude(@PathVariable long id) {
    projectService.deleteById(id);
  }

  @GetMapping
  public List<Project> consultList(Pageable page,
                                   @RequestParam(name = "language") String language) {
    if (LanguageEnum.notContainsLanguage(language)) {
      throw new IllegalArgumentException("Language is not valid");
    }

    return projectService.consultList(page, language);
  }
}
