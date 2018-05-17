package com.capgemini.bank.wrapper;

import com.capgemini.bank.model.Account;

public class AccountDeposit {
	private Account account;
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
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
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
	@Override
	public String toString() {
		return "AccountDeposit [account=" + account + ", customerId=" + customerId + ", bankId=" + bankId + "]";
	}
	/**
	 * @param account
	 * @param customerId
	 * @param bankId
	 * @param accountId
	 */
	public AccountDeposit(Account account, Integer customerId, Integer bankId, Integer accountId) {
		this.account = account;
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
	

}
