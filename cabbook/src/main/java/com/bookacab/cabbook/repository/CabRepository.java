package com.bookacab.cabbook.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookacab.cabbook.model.Book;

public interface CabRepository extends CrudRepository<Book, Integer> {
	
}
