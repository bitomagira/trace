package trace.msd.tiket;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(method = RequestMethod.POST,value = "/api/tiket")
public class tiketController {
	@Autowired
	private tiketService myTiketService;
	

	public tiketModel createtiket(@RequestBody tiketModel tiket) {
		return myTiketService.createTiket(tiket);
	}
	
	@GetMapping
	@CrossOrigin("http://localhost:3000")
	public List<tiketModel> getAll(){
		return myTiketService.getAll();
	}
	
	@GetMapping("/{id}")
	@CrossOrigin("http://localhost:3000")
	public tiketModel getOne(@PathVariable int id) {
		return myTiketService.getOne(id);
	}
	@RequestMapping(method = RequestMethod.PUT,value = "/api/tiket/{id}")
	public int updateOne(@RequestBody String trace,@PathVariable int id) {
//		log.warn(trace);
//		log.warn(myTiketService.putOne(trace));
		return myTiketService.putOne(trace,id);
				
	}
	
	

}
