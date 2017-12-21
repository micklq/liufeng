package com.borry.org.model.entity;


import com.borry.org.model.listener.UserEntityListener;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.groups.Default;

import java.io.Serializable;
import java.util.Date;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
@EntityListeners({ UserEntityListener.class })
@MappedSuperclass
public abstract class UserBaseEntity implements Serializable {

	/**
	 * 数据格式校验时使用的分组:创建数据,不验证id,创建时间,更新时间
	 */
	public abstract interface Save extends Default {

	}

	/**
	 * 数据格式校验时使用的分组:更新数据,不验证 创建时间,更新时间
	 */
	public abstract interface Update extends Default {

	}


	@Column(name = "create_date", columnDefinition = "timestamp NOT NULL DEFAULT '0000-00-00 00:00:00'", nullable = true)
	Date createDate;
	

	@Column(name = "modify_date", columnDefinition = "timestamp NULL DEFAULT CURRENT_TIMESTAMP", nullable = true)	
	private Date modifyDate;

	private Long creatorId; // 创建人id

	@Column(name = "data_from")
	private String dataFrom;


	public String getDataFrom() {
		return dataFrom;
	}

	public void setDataFrom(String dataFrom) {
		this.dataFrom = dataFrom;
	}

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	
	@JsonIgnore
	public Long getCreateDate() {
		if (createDate != null)
			return createDate.getTime();
		else
			return null;
	}

	public Date getCreateDateStr() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	@JsonIgnore
	public Long getModifyDate() {
		if (modifyDate != null)
			return modifyDate.getTime();
		else
			return null;
	}
	
	@JsonIgnore
	public Date getModifyDateStr() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}


	
}
