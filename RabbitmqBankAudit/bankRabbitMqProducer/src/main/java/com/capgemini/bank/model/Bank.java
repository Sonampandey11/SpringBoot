package com.capgemini.bank.model;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank extends BaseEntity {
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
	public void setBankId(final Integer bankId) {
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
	public void setBankName(final String bankName) {
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
	public void setBankBranch(final String bankBranch) {
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
	public void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}
	

	/**
	 * @return the account
	 */
	public Set<Account> getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(final Set<Account> account) {
		this.account = account;
	}
	/**
	 * @return the atm
	 */
	public Set<Atm> getAtm() {
		return atm;
	}
	/**
	 * @param atm the atm to set
	 */
	public void setAtm(final Set<Atm> atm) {
		this.atm = atm;
	}
	/**
	 * @param bankId
	 * @param bankName
	 * @param bankBranch
	 * @param amount
	 * @param customerId
	 */
	public Bank(final Integer bankId,final  String bankName, final String bankBranch, final BigDecimal amount) {
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", bankBranch=" + bankBranch + ", amount=" + amount
				+ ", account=" + (account != null ? toString(account, maxLen) : null) + ", atm="
				+ (atm != null ? toString(atm, maxLen) : null) + "]";
	}
	private String toString(Collection<?> collection, int maxLen) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		int i = 0;
		for (Iterator<?> iterator = collection.iterator(); iterator.hasNext() && i < maxLen; i++) {
			if (i > 0)
				builder.append(", ");
			builder.append(iterator.next());
		}
		builder.append("]");
		return builder.toString();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

	
}
	/**
	 * @return the bankId
	 */
	
