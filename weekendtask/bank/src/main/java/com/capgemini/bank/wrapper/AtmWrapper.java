package com.capgemini.bank.wrapper;

import com.capgemini.bank.model.Atm;

public class AtmWrapper {
	private Atm atm;
	private Integer atmid;
	private Integer bankId;
	private Integer customerId;
	/**
	 * @return the atmid
	 */
	public Integer getAtmid() {
		return atmid;
	}
	/**
	 * @param atmid the atmid to set
	 */
	public void setAtmid(Integer atmid) {
		this.atmid = atmid;
	}
	
	/**
	 * @return the atm
	 */
	public Atm getAtm() {
		return atm;
	}
	/**
	 * @param atm the atm to set
	 */
	public void setAtm(Atm atm) {
		this.atm = atm;
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
	
	public AtmWrapper() {
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AtmWrapper [atm=" + atm + ", atmid=" + atmid + ", bankId=" + bankId + ", customerId=" + customerId
				+ "]";
	}
	

}
