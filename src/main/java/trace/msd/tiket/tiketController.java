package trace.msd.tiket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tiketController {
	@Autowired
	private tiketService myTiketService;
	
	@RequestMapping(method = RequestMethod.POST,value = "/api/tiket")
	public tiketModel createtiket(@RequestBody tiketModel tiket) {
		return myTiketService.createTiket(tiket);
	}
	
	@RequestMapping("/api/tiket")
	public List<tiketModel> getAll(){
		return myTiketService.getAll();
	}
	
	@RequestMapping("/api/tiket/{id}")
	public tiketModel getOne(@PathVariable int id) {
		return myTiketService.getOne(id);
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/api/tiket/{id}")
	public tiketModel updateOne(@PathVariable int id,@RequestBody String trace) {
		System.out.println(trace);
		System.out.println(myTiketService.putOne(trace));
		return myTiketService.putOne(trace);
				
	}
	
	

}
