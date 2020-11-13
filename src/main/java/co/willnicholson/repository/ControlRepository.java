package co.willnicholson.repository;


import co.willnicholson.dto.ControlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlRepository extends JpaRepository<ControlEntity, String> {


}
