package com.paulasantana.opencommunity.project;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * * Classe de Serviço para Projetos.
 * @Author Paula Santana
 */
@Service
public class ProjectService {

  @Autowired
  ProjectRepository projectRepository;

  /**
   * Criar um novo projeto.
   * @param project dados de um novo projeto.
   * @return Project
   */
  public Project create(Project project) {
    return projectRepository.save(project);
  }

  /**
   * Consultar Projeto por Id.
   * @param id id único do projeto.
   * @return Project
   */
  public Project consultById(long id) {
    Optional<Project> project = projectRepository.findById(id);

    project.orElseThrow();

    return project.get();
  }

  /**
   * Excluir Projeto por Id.
   * @param id id único do projeto.
   */
  public void deleteById(long id) {
    Project project = consultById(id);
    projectRepository.deleteById(id);
  }

  /**
   * Consultar uma lista de Projetos.
   * @param pageable paginação da lista.
   * @param language linguagem de programação para filtrar.
   * @return List Project
   */
  public List<Project> consultList(Pageable pageable, String language) {
    return projectRepository.findByLanguage(language, pageable);
  }
}
