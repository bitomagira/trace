package trace.msd;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import trace.msd.cellule.celluleModel;
import trace.msd.cellule.celluleRepo;
import trace.msd.cellule.celluleService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class celluleTest{

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private celluleService myservice;
	
	@MockBean
	private celluleRepo myrepo;
	
	
	@Test
	public void getAllCelluleTest() {
		when(myrepo.findAll()).thenReturn(Stream.of(new celluleModel(376, "Danile", "steve","role", "USA"))
				.collect(Collectors.toList()));
		
		assertEquals(1,myservice.getAllCellule().size());		
	}
	
	@Test
	public void createcelluleTest() {
		celluleModel cellule=new celluleModel(376, "Danile", "steve","role", "USA");
		when(myrepo.save(cellule)).thenReturn(cellule);
		
		assertEquals(cellule, myservice.createcellule(cellule));
	}
	
	
//	@Test
//	public void getONeCelluleTest() {
//		celluleModel cellule=new	 celluleModel(376, "Danile", "steve","role", "USA");
//		
//		when(myrepo.findById(376)).thenReturn(cellule);
//		
//		assertEquals(cellule,myservice.getONeCellule(376));
//	}
	

}
