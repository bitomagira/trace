package trace.msd.tiket;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;

public interface tiketRepo extends JpaRepository<tiketModel, Integer> {
	@Transactional
	@Modifying
	@Query(
			value = "UPDATE tiket_model SET trace=?2 where id=?1",
			nativeQuery = true)
	int putOne(String trace,int id);
}
