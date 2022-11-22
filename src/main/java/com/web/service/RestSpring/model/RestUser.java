package com.web.service.RestSpring.model;

public class RestUser 
{
private String UserId;
private String Name;
private String email;
public String getUserId() 
{
	return UserId;
}
public void setUserId(String userId) 
{
	UserId = userId;
}
public String getName()
{
	return Name;
}
public void setName(String name) 
{
	Name = name;
}
public String getEmail()
{
	return email;
}
public void setEmail(String email)
{
	this.email = email;
}

}
