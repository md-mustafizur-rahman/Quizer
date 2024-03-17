package quizer.dreamzoneit.com.quizer.repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quizer.dreamzoneit.com.quizer.Model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
