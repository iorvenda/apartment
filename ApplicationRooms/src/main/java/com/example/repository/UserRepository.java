package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
	public User SaveDetails(User user);
	 public Optional<User> findById(Integer id);

}
