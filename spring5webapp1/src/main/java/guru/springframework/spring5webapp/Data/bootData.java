package guru.springframework.spring5webapp.Data;

import guru.springframework.spring5webapp.Domain.Authors;
import guru.springframework.spring5webapp.Repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootData implements CommandLineRunner {

    private final AuthorRepository author;


    bootData(AuthorRepository author){
        this.author = author;
       
    }

    @Override
    public void run(String... args) throws Exception {

        Authors Subek = new Authors("Subek", "Khadka");
        Authors Bipin = new Authors("Bipin","Khadka");



        author.save(Subek);
        author.save(Bipin);


        System.out.println("Number of Authors: " + author.count());
    }
}
