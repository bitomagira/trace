package trace.msd.tiket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;

public interface tiketRepo extends JpaRepository<tiketModel, Integer> {
	@Query(
			value = "select * from tiket_model where trace LIKE ?1",
			nativeQuery = true)
	tiketModel putOne(String trace);
}
