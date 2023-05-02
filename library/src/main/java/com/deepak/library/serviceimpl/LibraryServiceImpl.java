package com.deepak.library.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deepak.library.entity.Book;
import com.deepak.library.repository.LibraryRepository;
import com.deepak.library.service.BookService;

@Service
public class LibraryServiceImpl implements BookService {

	@Autowired
	private LibraryRepository libraryRepository;

	@Override
	public void saveBook(Book book) {
		libraryRepository.saveBook(book);

	}

	@Override
	public List<Book> getAllBooks() {
		return libraryRepository.getAllBooks();
	}

	@Override
	public Book getBook(long id) {
		return libraryRepository.getBook(id);
	}

	@Override
	public String deleteBook(long id) {

		Book book = getBook(id);
		if (book != null) {
			libraryRepository.deleteBook(id);
			return "deleted sucessfully";
		} else {
			return "no book found with this id=" + id;
		}

	}

	@Override
	public Book updateBook(Book book) {
		return libraryRepository.updateBook(book);

	}

}