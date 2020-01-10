package trace.msd.cellule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class celluleController {
	@Autowired
	private celluleService myService;
	
	@RequestMapping("/cellules")
	public List<celluleModel> getAll() {
		return myService.getAllCellule();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/cellules")
	public celluleModel saveone(@RequestBody celluleModel data) {
		return myService.createcellule(data);
	}
	
	@RequestMapping("/cellules/{id}")
	public celluleModel getOne(@PathVariable int id){
		return myService.getONeCellule(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/cellules/{id}")
	public void updateOne(@RequestBody celluleModel data)
	{
		myService.updateOne(data);
	}
	

}
