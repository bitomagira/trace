package trace.msd.cellule;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class celluleService {
	@Autowired
	private celluleRepo myRepo;
	
	public List<celluleModel> getAllCellule(){
		List<celluleModel> data=new ArrayList<celluleModel>();
		myRepo.findAll().forEach(cellule->{
			data.add(cellule);
		});
		return data;
	}
	
	public celluleModel createcellule(celluleModel data) {
		log.warn("data " + data);
		myRepo.save(data);
		return data;
	}

	public celluleModel getONeCellule(int id) {
		return myRepo.findById(id).get();
	}

	public void updateOne(celluleModel data) {
		myRepo.save(data);
		
	}
	
	

}
