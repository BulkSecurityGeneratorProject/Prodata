/*
 * Created on 2019-07-08 ( Date ISO 2019-07-08 - Time 15:31:57 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.cpa.prodata.controller.dto;

import javax.validation.constraints.NotNull;



/**
 * Hateoas resource associated with StaffRoles.
 * @author Somesh Biswas version 3.0.0
 */
public class StaffRolesDTO  {

		@NotNull
		   private Integer staffRoleId;  
		@NotNull
		   private Long staffId;  
		@NotNull
		   private String authority;  
		@NotNull
		   private String displayName;  

	// Constructor
	public StaffRolesDTO() {
		// Needed empty constructor for serialization
	}

	public Integer getStaffRoleId() {
		return this.staffRoleId;
	}
	public void setStaffRoleId(Integer staffRoleId) {
		this.staffRoleId = staffRoleId;
	}
	public Long getStaffId() {
		return this.staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public String getAuthority() {
		return this.authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder(); 
	sb.append("StaffRolesDTO");
		sb.append("staffRoleId :");
		sb.append(staffRoleId); 
		sb.append("staffId :");
		sb.append(staffId); 
		sb.append("|"); 
		sb.append("authority :");
		sb.append(authority); 
		sb.append("|"); 
		sb.append("displayName :");
		sb.append(displayName); 
        return sb.toString();
    }

}

