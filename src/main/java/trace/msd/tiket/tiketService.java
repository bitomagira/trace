package trace.msd.tiket;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public tiketModel putOne( String trace) {
		System.out.println(trace+ "  serv");
		System.out.println(myTiketRepo.putOne(trace));
		
		return myTiketRepo.putOne(trace);
	}
	
	

}
