package com.capgemini.bank.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RefMoney {

@Id
private BigDecimal denomination;


/**
 * 
 */
public RefMoney() {
	
}


/**
 * @return the denomination
 */
public BigDecimal getDenomination() {
	return denomination;
}


/**
 * @param denomination the denomination to set
 */
public void setDenomination(BigDecimal denomination) {
	this.denomination = denomination;
}


/**
 * @param denomId
 * @param denomination
 */
public RefMoney( BigDecimal denomination) {

	this.denomination = denomination;
}


/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "RefMoney [denomination=" + denomination + "]";
}

}
