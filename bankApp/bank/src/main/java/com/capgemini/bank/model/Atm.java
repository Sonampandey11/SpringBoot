package com.capgemini.bank.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Atm {
	@Id
	@GeneratedValue
	private Integer atmId;
	@Column(name="amount")
	private BigDecimal amount;
	/**
	 * @return the atmId
	 */
	public Integer getAtmId() {
		return atmId;
	}
	/**
	 * @param atmId the atmId to set
	 */
	public void setAtmId(Integer atmId) {
		this.atmId = atmId;
	}
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Atm [atmId=" + atmId + ", amount=" + amount + "]";
	}
	/**
	 * 
	 */
	public Atm() {
		
	}
	/**
	 * @param atmId
	 * @param amount
	 */
	public Atm(Integer atmId, BigDecimal amount) {
		this.atmId = atmId;
		this.amount = amount;
	}
	
}
	