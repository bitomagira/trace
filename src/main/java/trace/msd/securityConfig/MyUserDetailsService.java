//package trace.msd.securityConfig;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import trace.msd.cellule.celluleModel;
//import trace.msd.cellule.celluleRepo;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService{
//	
//	@Autowired
//	celluleRepo maCellule;
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Optional<celluleModel> cellule= maCellule.findByNom(username);
//		cellule.orElseThrow(()->new UsernameNotFoundException("not found"+username));
//		return cellule.map(MyUserDetails::new).get();
//	}
//
//}
