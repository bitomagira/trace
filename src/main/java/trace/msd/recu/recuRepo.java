package trace.msd.recu;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface recuRepo extends CrudRepository<recuModel, Integer>{
	
	public List<recuModel> findByResponsableId(int id);

}
