package trace.msd.recu;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import trace.msd.cellule.celluleModel;

@Entity
public class recuModel {
	@Id
	private int id;
	private String resNom;
	private String resPrenom;
	private String pseudo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="responsableid")
	private celluleModel responsable;
	private String lieu;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getResNom() {
		return resNom;
	}
	public void setResNom(String resNom) {
		this.resNom = resNom;
	}
	public String getResPrenom() {
		return resPrenom;
	}
	public void setResPrenom(String resPrenom) {
		this.resPrenom = resPrenom;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	public recuModel() {
		super();
	}
	
	public celluleModel getResponsable() {
		return responsable;
	}
	public void setResponsable(celluleModel responsable) {
		this.responsable = responsable;
	}
	public recuModel(int id, String resNom, String resPrenom, String pseudo, celluleModel responsable, String lieu) {
		super();
		this.id = id;
		this.resNom = resNom;
		this.resPrenom = resPrenom;
		this.pseudo = pseudo;
		this.responsable = responsable;
		this.lieu = lieu;
	}
	
	
	
	

}
