package com.capgemini.bank.wrapper;

import java.math.BigDecimal;

import com.capgemini.bank.model.Account;

public class AccountRequirement {
private Account account;
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
private Integer bankId;
private Integer customerId;
private String bankName;
private String customerName;

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
 * @param account
 * @param bankId
 * @param customerId
 * @param bankName
 * @param customerName
 */
public AccountRequirement(Account account, Integer bankId, Integer customerId, String bankName, String customerName) {
	this.account = account;
	this.bankId = bankId;
	this.customerId = customerId;
	this.bankName = bankName;
	this.customerName = customerName;
}
/**
 * @return the customerName
 */
public String getCustomerName() {
	return customerName;
}
/**
 * @param customerName the customerName to set
 */
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
/**
 * @return the account
 */

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
 * @param account
 * @param bankId
 * @param customerId
 * @param bankName
 * @param customerName
 */

/**
 * 
 */
public AccountRequirement() {
	super();
	// TODO Auto-generated constructor stub
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "AccountRequirement [account=" + account + ", bankId=" + bankId + ", customerId=" + customerId
			+ ", bankName=" + bankName + ", customerName=" + customerName + "]";
}



}
