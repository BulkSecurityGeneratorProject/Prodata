/*
 * Created on 2019-07-08 ( Date ISO 2019-07-08 - Time 15:31:55 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.cpa.prodata.service.criteria;

/**
 * Criteria bean used for Role search.
 * @author Somesh Biswas version 3.0.0
 */
public class RoleCriteria {

    private String activeFlag; 
    private String authority; 
    private String createdBy; 
    private String description; 
    private String displayName; 
    private String modifiedBy; 
	// Constructor
	public RoleCriteria() {
		// Needed empty constructor for serialization
	}

	public void setActiveFlag(String activeFlag) {this.activeFlag = activeFlag;}
	public String getActiveFlag() {return this.activeFlag;}
	public void setAuthority(String authority) {this.authority = authority;}
	public String getAuthority() {return this.authority;}
	public void setCreatedBy(String createdBy) {this.createdBy = createdBy;}
	public String getCreatedBy() {return this.createdBy;}
	public void setDescription(String description) {this.description = description;}
	public String getDescription() {return this.description;}
	public void setDisplayName(String displayName) {this.displayName = displayName;}
	public String getDisplayName() {return this.displayName;}
	public void setModifiedBy(String modifiedBy) {this.modifiedBy = modifiedBy;}
	public String getModifiedBy() {return this.modifiedBy;}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(activeFlag); 
		sb.append("|"); 
		sb.append(authority); 
		sb.append("|"); 
		sb.append(createdBy); 
		sb.append("|"); 
		sb.append(description); 
		sb.append("|"); 
		sb.append(displayName); 
		sb.append("|"); 
		sb.append(modifiedBy); 
        return sb.toString();
	}
}
