package com.bookacab.cabbook.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookacab.cabbook.model.Users;

public interface UserRepository extends CrudRepository<Users, Integer>{
public Users findByUsernameAndPassword(String username, String password);
}
