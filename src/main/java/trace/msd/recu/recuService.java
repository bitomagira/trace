package trace.msd.recu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class recuService {
	@Autowired
	private recuRepo monRipo;
	
	
	public List<recuModel> getAllRecu() {
		List<recuModel> data=new ArrayList<recuModel>();
		monRipo.findAll().forEach(recu->{
			data.add(recu);
		});
		return data;
	}
	
	public recuModel createRecu(recuModel data) {
		monRipo.save(data);
		return data;
	}
	
	public recuModel getOne(int id)
	{
		return  monRipo.findById(id).get();
	}

	public recuModel updateRecu(recuModel data) {
		 monRipo.save(data);
		 return data;
	}
	
	
	
}
