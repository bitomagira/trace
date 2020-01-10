package trace.msd.tiket;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import trace.msd.users.usersModel;

@Entity
public class tiketModel {
	@Id
	private int id;
	private int montant;
	@ManyToOne
	@JoinColumn
	private usersModel recupar;
	@ManyToOne
	private usersModel donnepar;
	private String trace;
	private Date daterecu;
	
	public tiketModel(int id, int montant, usersModel recupar, usersModel donnepar, Date daterecu,String trace) {
		super();
		this.id = id;
		this.montant = montant;
		this.recupar = recupar;
		this.donnepar = donnepar;
		this.daterecu = daterecu;
		this.trace=trace;
	}
	public tiketModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public usersModel getRecupar() {
		return recupar;
	}
	public void setRecupar(usersModel recupar) {
		this.recupar = recupar;
	}
	public usersModel getDonnepar() {
		return donnepar;
	}
	public void setDonnepar(usersModel donnepar) {
		this.donnepar = donnepar;
	}
	public Date getDaterecu() {
		return daterecu;
	}
	public void setDaterecu(Date daterecu) {
		this.daterecu = daterecu;
	}
	public String getTrace() {
		return trace;
	}
	public void setTrace(String trace) {
		this.trace = trace;
	}
	
	
	

}
