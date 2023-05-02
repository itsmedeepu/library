package com.deepak.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.deepak.library.entity.Book;
import com.deepak.library.serviceimpl.LibraryServiceImpl;

@RestController
public class LibraryContoller {

	@Autowired
	private LibraryServiceImpl libraryServiceImpl;

	@PostMapping("/savebook")
	public void saveBook(@RequestBody Book book) {
		libraryServiceImpl.saveBook(book);
	}

	@GetMapping("/getallbooks")
	public @ResponseBody List<Book> getAllBooks() {

		return libraryServiceImpl.getAllBooks();

	}

	@GetMapping("/getBookById/{id}")
	public @ResponseBody Book getBook(@PathVariable("id") long id) {

		return libraryServiceImpl.getBook(id);

	}

	@PutMapping("/update")
	public @ResponseBody Book updateBook(@RequestBody Book book) {
		return libraryServiceImpl.updateBook(book);

	}

	@DeleteMapping("/delete/{id}")
	public @ResponseBody String deleteBook(@PathVariable("id") long id) {

		return libraryServiceImpl.deleteBook(id);
ss
	}

}
