package guru.springframework.spring5webapp.Domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Book {

    private String title;
    private String isbn;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   @ManyToMany
   @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
   inverseJoinColumns = @JoinColumn(name = "auhtor_id"))
    private Set<Author> authors = new HashSet<>();

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;

    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", id=" + id +
                ", authors=" + authors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return authors != null ? authors.equals(book.authors) : book.authors == null;
    }

    @Override
    public int hashCode() {
        return authors != null ? authors.hashCode() : 0;
    }
}
