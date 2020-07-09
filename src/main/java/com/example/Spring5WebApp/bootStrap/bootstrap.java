package com.example.Spring5WebApp.bootStrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Spring5WebApp.Repository.AuthorRepository;
import com.example.Spring5WebApp.Repository.BookRepository;
import com.example.Spring5WebApp.Repository.PublisherRepository;
import com.example.Spring5WebApp.model.Author;
import com.example.Spring5WebApp.model.Book;
import com.example.Spring5WebApp.model.Publisher;

@Component
public class bootstrap implements CommandLineRunner{

	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	private final AuthorRepository authorRepository;
	
	
	
	public bootstrap(BookRepository bookRepository, PublisherRepository publisherRepository,
			AuthorRepository authorRepository) {
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
		this.authorRepository = authorRepository;
	}

	


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Publisher publisher1 = new Publisher();
		publisher1.setName("Publisher1");
		publisher1.setCity("ABC");
		publisher1.setZip(1352);
		publisherRepository.save(publisher1);
		
		Author author1 = new Author("Eric", "Johnson");
		Book book1 = new Book("Book1", "ADG98562");
		book1.setPublisher(publisher1);
		author1.getBooks().add(book1);
		book1.getAuthors().add(author1);
		publisher1.getBooks().add(book1);
		
		
		authorRepository.save(author1);
		bookRepository.save(book1);
		publisherRepository.save(publisher1);
		
		Author author2 = new Author("James", "Gordon");
		Book book2 = new Book("Book2", "DFG09876543");
		book2.setPublisher(publisher1);
		author1.getBooks().add(book2);
		book1.getAuthors().add(author2);
		publisher1.getBooks().add(book2);
		
		authorRepository.save(author2);
		bookRepository.save(book2);
		publisherRepository.save(publisher1);
		
		System.out.println("Total books: "+ bookRepository.count());
		System.out.println("publisher's books: "+publisher1.getBooks().size());
	}
}
