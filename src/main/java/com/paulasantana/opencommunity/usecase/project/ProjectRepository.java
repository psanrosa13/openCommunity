package com.paulasantana.opencommunity.usecase.project;

import java.util.ArrayList;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

  @Query("SELECT * FROM Project p WHERE LOWER(p.language) = LOWER(:name) ")
  ArrayList<Project> findByLanguage(@Param("language") String language, Pageable pageable);
}
