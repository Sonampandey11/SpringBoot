package com.capgemini.bank.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue
	private Integer accountId;
	private BigDecimal amount;

	@ManyToOne(targetEntity=Bank.class)
	private Bank bank;

	@ManyToOne(targetEntity=Customer.class)
	private Customer customer;


	/**
	 * @return the accountId
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
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

	/**
	 * @param accountId
	 * @param customerId
	 * @param amount
	 * @param bankId
	 */
	public Account(final Integer accountId, final Integer customerId, final BigDecimal amount) {
		this.accountId = accountId;
		this.amount = amount;

	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", amount=" + amount + ", bank=" + bank + ", customer=" + customer
				+ "]";
	}
	/**
	 * @param bank the bank to set
	 */
	public void setBank(final Bank bank) {
		this.bank = bank;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}
	/**
	 * 
	 */
	public Account() {

	}


}
