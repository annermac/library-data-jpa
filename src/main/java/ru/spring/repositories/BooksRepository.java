package ru.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spring.models.Book;

import java.util.List;


@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
    List<Book> findByTitleContainingIgnoreCase(String title);
}