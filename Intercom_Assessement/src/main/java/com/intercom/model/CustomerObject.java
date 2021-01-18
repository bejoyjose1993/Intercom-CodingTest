package com.intercom.model;

public class CustomerObject implements Comparable{
	private Float latitude;
	private int user_id;
	private String userName;
	private Float longitude;
	
	
	public CustomerObject(){}
	
	public CustomerObject(int user_id, String userName, Float latitude, Float longitude) {
		this.user_id = user_id;
		this.userName = userName;
		this.latitude = latitude;
		this.longitude= longitude;
		
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return userName;
	}
	public void setName(String name) {
		this.userName = name;
	}
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	@Override
    public String toString() {
        return "user_id=" + user_id + ", name=" + userName;
    }
	
	public int compareTo(Object customer_obj) {
		int compare_user_Id=((CustomerObject)customer_obj).getUser_id();
		// TODO Auto-generated method stub
		return this.user_id-compare_user_Id;
	}
}
