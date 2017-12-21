package com.borry.org.model.entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


/**
 * Created by
 * User: djyin
 * Date: 12/16/13
 * Time: 7:37 PM
 * 代表系统中对象的访问许可
 */
@Entity
public class Department extends BaseEntity {
	
	/**
	 * The Organization Id
	 */
	private long organizationId;
    /**
     * The Department Name.
     */    
    private String name;//名称    
    /**
     * The Department Description.
     */
    @Column(length = 1024, nullable = true)
    private String description;  
    
    private long parentId;//父结点id

	public long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}
    
    
    


	
	
}
