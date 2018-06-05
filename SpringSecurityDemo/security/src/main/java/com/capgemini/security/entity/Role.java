package com.capgemini.security.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;



@Entity
@Table(name="role")
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")
	private int id;

	private String role;

	/**
	 * @param role
	 */
	public Role(String role) {
		this.role = role;
	}

	/**
	 * 
	 */
	public Role() {
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
  
	/* @ManyToMany
	  @JoinTable(name="roles_privileges", joinColumns=@JoinColumn(name="role_id",referencedColumnName="id"), 
	  inverseJoinColumns=@JoinColumn(name="privilege_id", referencedColumnName="id"))
		private Collection<Privilege> privilege;

	*//**
	 * @return the privilege
	 *//*
	public Collection<Privilege> getPrivilege() {
		return privilege;
	}

	*//**
	 * @param privilege the privilege to set
	 *//*
	public void setPrivilege(Collection<Privilege> privilege) {
		this.privilege = privilege;
	}
*/
}
