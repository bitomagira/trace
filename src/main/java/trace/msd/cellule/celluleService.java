package trace.msd.cellule;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		System.out.println(data);
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
