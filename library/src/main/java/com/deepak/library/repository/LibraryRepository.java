package com.deepak.library.repository;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.deepak.library.entity.Book;

@Repository
public class LibraryRepository {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveBook(Book book) {

		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(book);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public List<Book> getAllBooks() {

		try {
			Session session = sessionFactory.openSession();
			String query = "from Book";
			Query query2 = session.createQuery(query);
			List<Book> books = query2.getResultList();

			return books;
		} catch (Exception e) {
			System.out.println(e);
		}

		return Collections.EMPTY_LIST;

	}
}
