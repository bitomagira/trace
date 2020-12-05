package trace.msd.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(
			value = "select * from users_model where nom=?1 and prenom=?2",
			nativeQuery = true)
	public User getUserByLogin(String login, String pwd);

	public User findByPseudo(String mail);

}
