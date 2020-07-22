package com.paulasantana.opencommunity.usecase.voluntary;

import com.paulasantana.opencommunity.usecase.project.Project;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VoluntaryRepository extends JpaRepository<Voluntary, Long> {

  @Query("SELECT * FROM Voluntary v")
  List<Voluntary> findByLanguage(String language, Pageable page);
}
