package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author trainee
 *
 */
@Entity
public class Supplier {
	@Id
	private Integer supplierId;
	@Column
	private String supplierName;
	@Column
	private String supplierAddress;
	@Column
	private Integer quantityOrder;
	@Column
	private Integer orderId;
	@Column
	private String amount;
	@Column
	private Integer retailerId;
	/**
	 * @return the supplierId
	 */
	public Integer getSupplierId() {
		return supplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	/**
	 * @return the supplierAddress
	 */
	public String getSupplierAddress() {
		return supplierAddress;
	}
	/**
	 * @param supplierAddress the supplierAddress to set
	 */
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	/**
	 * @return the quantityOrder
	 */
	public Integer getQuantityOrder() {
		return quantityOrder;
	}
	/**
	 * @param quantityOrder the quantityOrder to set
	 */
	public void setQuantityOrder(Integer quantityOrder) {
		this.quantityOrder = quantityOrder;
	}
	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the retailerId
	 */
	public Integer getRetailerId() {
		return retailerId;
	}
	/**
	 * @param retailerId the retailerId to set
	 */
	public void setRetailerId(Integer retailerId) {
		this.retailerId = retailerId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", quantityOrder=" + quantityOrder + ", orderId=" + orderId + ", amount=" + amount
				+ ", retailerId=" + retailerId + "]";
	}
	/**
	 * 
	 */
	public Supplier() {
	}
    
	
}
