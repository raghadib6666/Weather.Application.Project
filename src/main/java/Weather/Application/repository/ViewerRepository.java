package Weather.Application.repository;
import Weather.Application.entity.Viewer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViewerRepository extends JpaRepository<Viewer, String> {



}
