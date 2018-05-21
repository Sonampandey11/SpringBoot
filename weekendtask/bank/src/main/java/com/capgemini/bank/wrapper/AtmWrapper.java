package com.capgemini.bank.wrapper;

import com.capgemini.bank.model.Atm;
import com.capgemini.bank.model.Bank;

public class AtmWrapper {
	private Atm atm;
	private Integer bankId;
	/**
	 * @return the atmid
	 */
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
	

}
