package br.com.cesar.ProjetoM4;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STT_STATUS")
public class Status {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="STATUS_ID", nullable=false)
	private String idStatus;

	@Column(name="STATUS_STATUS")
	private String status;
	
	public Status() {
	}
	
	public Status(String idStatus, String status) {
		this.idStatus = idStatus;
		this.status = status;
	}

	public String getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(String idStatus) {
		this.idStatus = idStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
