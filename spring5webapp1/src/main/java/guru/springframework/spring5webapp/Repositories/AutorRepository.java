package guru.springframework.spring5webapp.Repositories;

import guru.springframework.spring5webapp.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AutorRepository extends CrudRepository<Author, Long> {



}
