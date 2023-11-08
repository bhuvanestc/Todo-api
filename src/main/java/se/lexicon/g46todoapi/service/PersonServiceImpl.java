package se.lexicon.g46todoapi.service;

import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.g46todoapi.converter.PersonConverter;
import se.lexicon.g46todoapi.domain.dto.PersonDTOForm;
import se.lexicon.g46todoapi.domain.dto.PersonDTOView;
import se.lexicon.g46todoapi.repository.PersonRepository;

import java.util.List;
import java.util.Optional;
@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonConverter personConverter;

    @Override
    public List<PersonDTOView> getAll() {

        return null;
    }

    @Override
    public Optional<PersonDTOView> findById(Long id) {
        return null;
    }

    @Override
    public Optional<PersonDTOView> createOrUpdate(@NotNull PersonDTOForm form) {
        return null;
    }
}
