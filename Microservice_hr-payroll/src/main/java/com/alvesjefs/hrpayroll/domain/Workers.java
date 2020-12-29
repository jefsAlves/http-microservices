package com.alvesjefs.hrpayroll.domain;

import java.io.Serializable;
import java.util.Objects;

public class Workers implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String email;
	private Double dailyIncome;
	private String cpf;
	private String rg;

	public Workers() {
	}

	public Workers(Long id, String name, String email, Double dailyIncome, String cpf, String rg) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dailyIncome = dailyIncome;
		this.cpf = cpf;
		this.rg = rg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getDayIncome() {
		return dailyIncome;
	}

	public void setDayIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Workers other = (Workers) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Workers [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", dailyIncome=");
		builder.append(dailyIncome);
		builder.append(", cpf=");
		builder.append(cpf);
		builder.append(", rg=");
		builder.append(rg);
		builder.append("]");
		return builder.toString();
	}

}
