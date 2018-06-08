package com.capgemini.bank.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {
	private Integer userId;

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 
	 */
	public BaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BaseEntity [userId=" + userId + "]";
	}
	

}
