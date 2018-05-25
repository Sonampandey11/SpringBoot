package com.capgemini.bank.wrapper;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.capgemini.bank.model.RefMoney;
@Entity
public class DenominationWrapper {
	@Id
	private Integer bankId;
	private Integer atmId;
/*	private List<BigDecimal> list;
	*//**
	 * @return the bankId
	 *//*
	public Integer getBankId() {
		return bankId;
	}
	*//**
	 * @param bankId the bankId to set
	 *//*
	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}
	*//**
	 * @return the atmId
	 *//*
	public Integer getAtmId() {
		return atmId;
	}
	*//**
	 * @param atmId the atmId to set
	 *//*
	public void setAtmId(Integer atmId) {
		this.atmId = atmId;
	}
	*//**
	 * @return the moneys
	 *//*
	
	*//**
	 * 
	 *//*
	public DenominationWrapper() {
		
	}
	*//**
	 * @return the list
	 *//*
	public List<BigDecimal> getList() {
		return list;
	}
	*//**
	 * @param list the list to set
	 *//*
	public void setList(List<BigDecimal> list) {
		this.list = list;
	}
	 (non-Javadoc)
	 * @see java.lang.Object#toString()
	 
	 (non-Javadoc)
	 * @see java.lang.Object#toString()
	 
	@Override
	public String toString() {
		final int maxLen = 10;
		return "DenominationWrapper [bankId=" + bankId + ", atmId=" + atmId + ", list="
				+ (list != null ? list.subList(0, Math.min(list.size(), maxLen)) : null) + "]";
	}
	
	*/

}
