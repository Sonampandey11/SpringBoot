package com.example.mongoodbdemo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Audit {
	
	@Id
	private UUID eventId = UUID.randomUUID();
	
	private String eventName;
	private String eventType;
	private LocalDateTime eventDate;
	private Integer userId;
    private Object oldValue;
    private Object newValue;
	/**
	 * @return the eventId
	 */
	public UUID getEventId() {
		return eventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(UUID eventId) {
		this.eventId = eventId;
	}
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the eventDate
	 */
	public LocalDateTime getEventDate() {
		return eventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(LocalDateTime eventDate) {
		this.eventDate = eventDate;
	}
	/**
	 * @return the userId
	 */
	public  Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId( Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the oldValue
	 */
	public Object getOldValue() {
		return oldValue;
	}
	/**
	 * @param oldValue the oldValue to set
	 */
	public void setOldValue(Object oldValue) {
		this.oldValue = oldValue;
	}
	/**
	 * @return the newValue
	 */
	public Object getNewValue() {
		return newValue;
	}
	/**
	 * @param newValue the newValue to set
	 */
	public void setNewValue(Object newValue) {
		this.newValue = newValue;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	/**
	 * 
	 */
	public Audit() {
	
	}
	/**
	 * @param eventId
	 * @param eventName
	 * @param eventType
	 * @param eventDate
	 * @param userId
	 * @param oldValue
	 * @param newValue
	 */
	public Audit( String eventName, String eventType, LocalDateTime eventDate, Integer userId,
			Object oldValue, Object newValue) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventType = eventType;
		this.eventDate = eventDate;
		this.userId = userId;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Audit [eventId=" + eventId + ", eventName=" + eventName + ", eventType=" + eventType + ", eventDate="
				+ eventDate + ", userId=" + userId + ", oldValue=" + oldValue + ", newValue=" + newValue + "]";
	}
	
    

}
