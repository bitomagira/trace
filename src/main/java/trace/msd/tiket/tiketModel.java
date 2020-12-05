package trace.msd.tiket;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import trace.msd.users.User;

@Entity(name = "ticket")
public class tiketModel {
	@Id
	private int id;
	private int montant;
	@ManyToOne
	@JoinColumn
	private User recupar;
	@ManyToOne
	private User donnepar;
	private String trace;
	private Date daterecu;
	
	public tiketModel(int id, int montant, User recupar, User donnepar, Date daterecu, String trace) {
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
	public User getRecupar() {
		return recupar;
	}
	public void setRecupar(User recupar) {
		this.recupar = recupar;
	}
	public User getDonnepar() {
		return donnepar;
	}
	public void setDonnepar(User donnepar) {
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
