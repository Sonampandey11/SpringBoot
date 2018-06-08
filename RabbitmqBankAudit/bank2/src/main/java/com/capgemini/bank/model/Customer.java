package com.capgemini.bank.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 * @author trainee
 *
 */
@Entity
public class Customer extends BaseEntity implements Cloneable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customerId")
	private Integer customerId;
	@Column(name="name")
	private String name;
	@Column(name="pin")
	private Integer pin;
	/*@OneToMany(targetEntity=Transaction.class)
	private Transaction transaction;*/
	@ManyToOne(targetEntity=Bank.class)
	private Bank bank;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", pin=" + pin
				+ ", bank=" + bank + "]";
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pin
	 */
	public Integer getPin() {
		return pin;
	}
	/**
	 * @param pin the pin to set
	 */
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	/**
	 * @return the bank
	 */
	public Bank getBank() {
		return bank;
	}
	/**
	 * @param bank the bank to set
	 */
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	/**
	 * @param customerId
	 * @param bankId
	 * @param name
	 * @param pin
	 * @param bank
	 */
	public Customer(Integer customerId, String name, Integer pin, Bank bank) {
		this.customerId = customerId;
		this.name = name;
		this.pin = pin;
		this.bank = bank;
	}
	/**
	 * 
	 */
	public Customer() {
	
	}
	public Customer clone() throws CloneNotSupportedException {
		return (Customer) super.clone();
	} 
	
}
