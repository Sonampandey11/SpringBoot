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
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customerId")
	@Getter
	@Setter
	private Integer customerId;
	
	@Column(name="customerName")
	@Getter
	@Setter
	private String name;
	@Column(name="pin")
	@Getter
	@Setter
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
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}
