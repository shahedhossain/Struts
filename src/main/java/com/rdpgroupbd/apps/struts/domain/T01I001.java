package com.rdpgroupbd.apps.struts.domain;


import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "T01I001")
@Access(AccessType.FIELD)
public class T01I001 implements  Serializable {

	private static final long serialVersionUID = 4523874588485172008L;

	@Id
	@TableGenerator(name = "T01I001", table = "T01S001", pkColumnName = "F_SEQ_NAME", pkColumnValue = "T01I001", valueColumnName = "F_SEQ_VALUE", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "T01I001")
	@Column(name = "F_CONTINENT_CODE", nullable = false, updatable = false)
	private Integer continentId;

	@NotEmpty(message = "Not Empty")
	@Column(name = "F_NAME_EN", length = 45, nullable = false)
	private String nameEn;

	@Column(name = "F_NAME_BN", length = 100)
	private String nameBn;

	@Version
	@Column(name = "F_REVISION", nullable = false)
	private Integer version;

	public Integer getContinentId() {
		return continentId;
	}

	public void setContinentId(Integer continentId) {
		this.continentId = continentId;
	}

	public String getNameEn() {
		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameBn() {
		return nameBn;
	}

	public void setNameBn(String nameBn) {
		this.nameBn = nameBn;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (continentId != null ? continentId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof T01I001)) {
			return false;
		}
		T01I001 other = (T01I001) object;
		if ((this.continentId == null && other.continentId != null)
				|| (this.continentId != null && !this.continentId
						.equals(other.continentId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s[%s=%s]", this.getClass().getName(),
				"continentId", continentId);
	}
	
}

