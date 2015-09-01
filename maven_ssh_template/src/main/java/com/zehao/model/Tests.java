package com.zehao.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "T_TEST", schema = "test")
public class Tests implements Serializable {

	// Fields
	private int id;
	private String name;
	private String pwd;
	private Date createDateTime;
	private Date modifyDateTime;
	private Boolean active;

	// Constructors

	/**
	 * default
	 */
	public Tests() {
	}

	/**
	 * minimal
	 */
	public Tests(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}

	/**
	 * full
	 */
	public Tests(String name, String pwd, Date createDateTime, Date modifyDateTime, Boolean active) {
		this.name = name;
		this.pwd = pwd;
		this.createDateTime = createDateTime;
		this.modifyDateTime = modifyDateTime;
		this.active = active;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "pwd", nullable = false, length = 32)
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createDateTime", length = 7)
	public Date getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifyDateTime", length = 7)
	public Date getModifyDateTime() {
		return modifyDateTime;
	}

	public void setModifyDateTime(Date modifyDateTime) {
		this.modifyDateTime = modifyDateTime;
	}

	@Column(name = "active", nullable = false, columnDefinition = "tinyint default 1", length = 1)
	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
