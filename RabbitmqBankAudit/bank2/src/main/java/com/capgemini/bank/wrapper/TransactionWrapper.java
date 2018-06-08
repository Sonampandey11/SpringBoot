package com.capgemini.bank.wrapper;

public class TransactionWrapper {
	private Integer transcationId;
	private Integer customerId;
	private Integer accountId;
	private String transactionType;
	
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the transcationId
	 */
	public Integer getTranscationId() {
		return transcationId;
	}
	/**
	 * @param transcationId the transcationId to set
	 */
	public void setTranscationId(Integer transcationId) {
		this.transcationId = transcationId;
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
	 * @return the accountId
	 */
	public Integer getAccountId() {
		return accountId;
	}
	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	/**
	 * 
	 */
	public TransactionWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
