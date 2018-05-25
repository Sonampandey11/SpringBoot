package com.capgemini.bank.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BankDenominationTable extends BaseEntity {
	@Id
	private Integer bankId;
	private Integer noOfDenom;
	private BigDecimal denominationAmount;
	@OneToOne(targetEntity=Bank.class)
	private Bank bank;
	/**
	 * @return the bank
	 */
	public Bank getBank() {
		return bank;
	}
	/**
	 * @param bank the bank to set
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	/**
	 * @return the noOfDenom
	 */
	public Integer getNoOfDenom() {
		return noOfDenom;
	}
	/**
	 * @param noOfDenom the noOfDenom to set
	 */
	public void setNoOfDenom(Integer noOfDenom) {
		this.noOfDenom = noOfDenom;
	}
	/**
	 * @return the denominationAmount
	 */
	public BigDecimal getDenominationAmount() {
		return denominationAmount;
	}
	/**
	 * @param denominationAmount the denominationAmount to set
	 */
	public void setDenominationAmount(BigDecimal denominationAmount) {
		this.denominationAmount = denominationAmount;
	}

	/**
	 * @return the bankId
	 */
	public Integer getBankId() {
		return bankId;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	/**
	 * 
	 */
	public BankDenominationTable() {

	}

}