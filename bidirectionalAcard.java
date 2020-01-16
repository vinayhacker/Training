package com.deloitte.secondmvn.hibthird.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AadharCard 
{
	@Id
	int aid;
	@Column(name="issue_auth")
	String issueAuth;
	@Column(name="issue_date")
	Date issueDate;
	@OneToOne(mappedBy="acard")
	Person person;
	public AadharCard(){}
	public AadharCard(int aid, String issueAuth, Date issueDate)
	{
		this.aid = aid;
		this.issueAuth = issueAuth;
		this.issueDate = issueDate;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getIssueAuth() {
		return issueAuth;
	}
	public void setIssueAuth(String issueAuth) {
		this.issueAuth = issueAuth;
	}
	public java.sql.Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(java.sql.Date issueDate) {
		this.issueDate = issueDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	

}
