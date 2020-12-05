package trace.msd.tiket;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class tiketService {
	@Autowired
	private tiketRepo myTiketRepo;
	
	
	public List<tiketModel> getAll() {
		
		return myTiketRepo.findAll();
	}
	
	public tiketModel createTiket(tiketModel tiket) {
		
		myTiketRepo.save(tiket);
		return tiket;
		
	}
	
	public tiketModel getOne(int id) {
		
		return myTiketRepo.findById(id).get();
	}

	public int putOne( String trace,int id) {
		log.warn("my ticket " + myTiketRepo.putOne(trace,id));
		
		return myTiketRepo.putOne(trace,id);
	}
	
	

}
