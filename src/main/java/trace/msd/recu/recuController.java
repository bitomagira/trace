package trace.msd.recu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class recuController {
	@Autowired
	private recuService monRecu;
	
	@RequestMapping("/recu")
	public List<recuModel> getAllRecu() {
		System.out.println("in controlller");
		return monRecu.getAllRecu();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/recu")
	public recuModel createRecu(@RequestBody recuModel data) {
		return monRecu.createRecu(data);
	}
	
	@RequestMapping("/recu/{id}")
	public recuModel getOne(@PathVariable int id) {
		return monRecu.getOne(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/recu/{id}")
	public recuModel updateRecu(@RequestBody recuModel data) {
		return monRecu.updateRecu(data);
	}
	

}
