package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Book;

@Repository
public interface BookRep extends JpaRepository<Book, Long>{

}
