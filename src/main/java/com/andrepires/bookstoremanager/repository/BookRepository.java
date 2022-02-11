package com.andrepires.bookstoremanager.repository;

import com.andrepires.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
