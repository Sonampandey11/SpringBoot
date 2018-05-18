package com.capgemini.bank.wrapper;

import java.math.BigDecimal;

import com.capgemini.bank.model.Account;

public class AccountDeposit {
	private BigDecimal amount;
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
	private Integer customerId;
	private Integer bankId;
	private Integer accountId;
	
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
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * @param account
	 * @param customerId
	 * @param bankId
	 * @param accountId
	 */
	public AccountDeposit(Account account, Integer customerId, Integer bankId, Integer accountId) {
		
		this.customerId = customerId;
		this.bankId = bankId;
		this.accountId = accountId;
	}
	/**
	 * 
	 */
	public AccountDeposit() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountDeposit [amount=" + amount + ", customerId=" + customerId + ", bankId=" + bankId + ", accountId="
				+ accountId + "]";
	}
	

}
