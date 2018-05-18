package com.capgemini.bank.wrapper;

import java.math.BigDecimal;

public class TransactionWrapper {
	private Integer accountId;
	private Integer bankId;
	private Integer customerId;
	private BigDecimal amount;
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getBankId() {
		return bankId;
	}
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public TransactionWrapper() {
		
		// TODO Auto-generated constructor stub
	}
	

}
