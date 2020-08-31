package com.example.shows.demo.User;

import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;
import java.lang.Integer;

// User Bean
@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;

	@Size(min = 2,message = "Name should have atleast 2 char")
	private String name;

	@Digits(fraction = 0,integer = 7,message = "Phone should be less than 8 digits")
	private Integer phnNum;

	 // date should be in past
	private Date showTime;

	private boolean expire;

	public boolean isExpire() {
		return expire;
	}

	public void setExpire(boolean expire) {
		this.expire = expire;
	}

	public User(Integer id, String name, Date showTime, Integer phnNum, boolean expire) {
		this.id = id;
		this.name = name;
		this.showTime = showTime;
		this.phnNum = phnNum;
		this.expire = expire;
	}


	User()
	{

	}

	public Integer getId() {
		return id;
	}

	public void setPhnNum(Integer phnNum) {
		this.phnNum = phnNum;
	}

	public Integer getPhnNum() {
		return phnNum;
	}

	public String getName() {
		return name;
	}

	public Date getShowTime() {
		return showTime;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShowTime(Date birthDate) {
		this.showTime = birthDate;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phnNum=" + phnNum +
				", showTime=" + showTime +
				", expire=" + expire +
				'}';
	}
}
