package guru.springframework.spring5webapp.Repositories;

import guru.springframework.spring5webapp.Domain.Authors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface AuthorRepository extends CrudRepository<Authors, Long> {
}
