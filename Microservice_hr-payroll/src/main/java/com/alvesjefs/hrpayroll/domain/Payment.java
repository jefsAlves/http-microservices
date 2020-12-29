package com.alvesjefs.hrpayroll.domain;

import java.io.Serializable;
import java.util.Objects;

public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private Integer days;
	private Double dailyIncome;

	public Payment() {
	}

	public Payment(String name, Integer days, Double dailyIncome) {
		super();
		this.name = name;
		this.days = days;
		this.dailyIncome = dailyIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

	public Double getTotal() {
		return days * dailyIncome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(days);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Payment other = (Payment) obj;
		return Objects.equals(days, other.days);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payment [name=");
		builder.append(name);
		builder.append(", days=");
		builder.append(days);
		builder.append(", dailyIncome=");
		builder.append(dailyIncome);
		builder.append("]");
		return builder.toString();
	}

}
