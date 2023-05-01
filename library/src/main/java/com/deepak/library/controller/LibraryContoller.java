package com.deepak.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

}
