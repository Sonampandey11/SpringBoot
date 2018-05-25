package com.capgemini.bank.wrapper;

import com.capgemini.bank.model.Bank;
import com.capgemini.bank.model.Customer;

public class CustomerWrapper {

private Customer cust;
	private Integer bankId;
	/**
	 * @return the cust
	 */
	public Customer getCust() {
		return cust;
	}
	/**
	 * @param cust the cust to set
	 */
	public void setCust(Customer cust) {
		this.cust = cust;
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
	public CustomerWrapper() {
	
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerWrapper [cust=" + cust + ", bankId=" + bankId + "]";
	}

	
	
}