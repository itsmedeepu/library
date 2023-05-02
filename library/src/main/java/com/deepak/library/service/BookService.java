package com.deepak.library.service;

import java.util.List;

import com.deepak.library.entity.Book;

public interface BookService {

	public void saveBook(Book book);

	public List<Book> getAllBooks();

	public Book getBook(long id);

	public Book updateBook(Book book);

	public String deleteBook(long id);

}