package com.capgemini.bank.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bankId")
	private Integer bankId;
	private String bankName;
	private String bankBranch;
	@Column(name="amount")
	private BigDecimal amount;
	@OneToMany(targetEntity=Account.class)
	private Set<Account> account;
	@OneToMany(targetEntity=Atm.class)
	private Set<Atm> atm;
	
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
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	/**
	 * @return the bankBranch
	 */
	public String getBankBranch() {
		return bankBranch;
	}
	/**
	 * @param bankBranch the bankBranch to set
	 */
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
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

	/**
	 * @param bankId
	 * @param bankName
	 * @param bankBranch
	 * @param amount
	 * @param customerId
	 */
	public Bank(Integer bankId, String bankName, String bankBranch, BigDecimal amount) {
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankBranch = bankBranch;
		this.amount = amount;
		
	}
	
	/**
	 * 
	 */
	public Bank() {
		
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", bankBranch=" + bankBranch + ", amount=" + amount
				+ "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	
}
	/**
	 * @return the bankId
	 */
	
