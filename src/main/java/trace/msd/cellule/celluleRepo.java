package trace.msd.cellule;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface celluleRepo extends CrudRepository<celluleModel, Integer> {

	Optional<celluleModel> findByNom(String username);
	
	
	
}
