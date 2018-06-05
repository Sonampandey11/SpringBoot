package com.capgemini.security.entity;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table
public class Privilege {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	/*@ManyToMany(mappedBy="Privilege")
	private Collection<Role> roles;*/
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the roles
	 *//*
	public Collection<Role> getRoles() {
		return roles;
	}
	*//**
	 * @param roles the roles to set
	 *//*
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}*/
	

}
