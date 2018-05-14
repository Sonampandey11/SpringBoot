package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

import com.example.demo.customannotation.Sonam;

@Entity
public class Customer {
	@Id
	@Column(name="customerId")
    private Integer customerId;
	@Column(name="customerName")
	private String customerName;
	@Column(name="customerAddress")
	private String customerAddress;
	@Column(name="payementMode")
	private String paymentMode;
	@Column(name="retailerId")
	private Integer retailerId;
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
	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(final Integer customerId) {
		this.customerId = customerId;
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
	public void setCustomerName(final String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(final String customerAddress) {
		this.customerAddress = customerAddress;
	}
	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}
	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(final String paymentMode) {
		this.paymentMode = paymentMode;
	}


	/**
	 * @param customerId
	 * @param customerName
	 * @param customerAddress
	 * @param paymentMode
	 * @param retailerId
	 */
	public Customer(Integer customerId, String customerName, String customerAddress, String paymentMode, int retailerId) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.paymentMode = paymentMode;
		this.retailerId = retailerId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", paymentMode=" + paymentMode + ", retailerId=" + retailerId + "]";
	}



	}
