package guru.springframework.spring5webapp.BootStrap;

import guru.springframework.spring5webapp.Domain.Author;
import guru.springframework.spring5webapp.Domain.Book;
import guru.springframework.spring5webapp.Repositories.AutorRepository;
import guru.springframework.spring5webapp.Repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AutorRepository autorrepository;
    private final BookRepository bookrepository;

   public BootStrapData(AutorRepository autorrepository, BookRepository bookrepository){
       this.autorrepository = autorrepository;
       this.bookrepository = bookrepository;
   }



    @Override
    public void run(String... args) throws Exception {

       Author eric = new Author("Eric", "Evans");
       Book dd = new Book("Kaloo",  "121212");
       eric.getBooks().add(dd);
       dd.getAuthors().add(eric);

      bookrepository.save(dd);
      autorrepository.save(eric);

      System.out.println("Strated in Bootstrap");
      System.out.println("Number of books: " + bookrepository.count());


    }
}
