package trace.msd.cellule;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import trace.msd.recu.recuModel;

@Entity
public class celluleModel {
	@Id
	private int id;
	private String nom;
	private String prenom;
	private String cellule;
	private String role;
	
//	@OneToMany
//	@JoinColumn(name="recuid")
//	private recuModel recus;
//	
	
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
	public String getCellule() {
		return cellule;
	}
	public void setCellule(String cellule) {
		this.cellule = cellule;
	}
	
	public celluleModel(int id, String nom, String prenom, String cellule, String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.cellule = cellule;
		this.role = role;
	}
	public celluleModel() {
		super();
	}
	
	
	
	

}
