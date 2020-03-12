package guru.springframework.spring5webapp.Repositories;

import guru.springframework.spring5webapp.Domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
