package com.projetoTrabalhador.requests;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projetoTrabalhador.entities.Worker;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HourContractPostRequestBody implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Date date;
	private Double valuePerHour;
	private Integer hour;

	@ManyToOne
	@JoinColumn(name = "worker_id")
	private Worker worker;
	
	public HourContractPostRequestBody( Date date, Double valuePerHour, Integer hour) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hour = hour;
	}

	@JsonIgnore
	public Worker getWorker() {
		return worker;
	}

}
