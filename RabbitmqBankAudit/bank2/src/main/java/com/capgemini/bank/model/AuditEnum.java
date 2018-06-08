package com.capgemini.bank.model;

public class AuditEnum {
	public  enum  eventName
	{
		Customer, Account, Bank, Atm
	}
	
	public enum eventType
	{
		create, update
	}

}
