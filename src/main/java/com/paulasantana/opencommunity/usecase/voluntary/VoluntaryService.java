package com.paulasantana.opencommunity.usecase.voluntary;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VoluntaryService {

  @Autowired
  VoluntaryRepository voluntaryRepository;

  public List<Voluntary> consultList(Pageable page, String language) {
    return voluntaryRepository
        .findByLanguage(language, page);
  }

  public Voluntary create(Voluntary voluntary) {
    return voluntaryRepository.save(voluntary);
  }
}
