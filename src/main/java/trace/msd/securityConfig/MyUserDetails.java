//package trace.msd.securityConfig;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import trace.msd.cellule.celluleModel;
//
//public class MyUserDetails implements UserDetails{
//	
//	private String userName;
//	private String password;
//	private String cellule;
//	private String role;
//	
//	public  MyUserDetails(celluleModel cellule) {
//		this.userName=cellule.getNom();
//		this.password=cellule.getPrenom();
//	}
//
//	
//	 public MyUserDetails() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
//	}
//
//	@Override
//	public String getPassword() {
//		return password;
//	}
//
//	@Override
//	public String getUsername() {
//		return userName;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		return true;
//	}
//
//}
