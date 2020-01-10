package trace.msd.users;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Getter @Setter @NoArgsConstructor
public class usersModel {
	@Id
	private int id;
	private String nom;
	private String prenom;
	private String pseudo;
	private String role;
	private String password;
	
	public usersModel(int id,String nom,String prenom,String pseudo,String role,String password) {
		this.id=id;
		this.nom=nom;
		this.prenom=prenom;
		this.pseudo=pseudo;
		this.role=role;
		this.password=password;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public usersModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
