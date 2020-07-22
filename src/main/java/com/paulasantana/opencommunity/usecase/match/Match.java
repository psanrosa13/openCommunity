package com.paulasantana.opencommunity.usecase.match;

import com.paulasantana.opencommunity.usecase.project.ProjectService;
import com.paulasantana.opencommunity.usecase.voluntary.VoluntaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Match {

  @Autowired
  VoluntaryService voluntaryService;

  @Autowired
  ProjectService projectService;


}
