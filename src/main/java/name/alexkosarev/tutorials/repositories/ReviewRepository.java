package name.alexkosarev.tutorials.repositories;

import name.alexkosarev.tutorials.entities.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
}
