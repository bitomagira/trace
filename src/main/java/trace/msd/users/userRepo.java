package trace.msd.users;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface userRepo extends JpaRepository<usersModel, Integer> {

	@Query(
			value = "select * from users_model where nom=?1 and prenom=?2",
			nativeQuery = true)
	public usersModel getUserByLogin(String login,String pwd);

}
