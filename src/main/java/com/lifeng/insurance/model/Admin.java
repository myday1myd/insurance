package com.lifeng.insurance.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * 用户管理员
 * @author PA
 *
 */
@Entity
@Table(name="insurance_admin")
public class Admin  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2937185882834602144L;
	
	@Id
	@Column(name = "id",columnDefinition="bigint COMMENT '主键，自动生成'")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="user_name",columnDefinition="varchar(100) COMMENT '用户姓名'",unique=true)
	private String userName;
	
	@Column(name="password",columnDefinition="varchar(100) COMMENT '用户密码'")
	private String password;
	
	@Column(name = "create_time", columnDefinition = "timestamp COMMENT '创建时间' DEFAULT CURRENT_TIMESTAMP ", insertable = false, updatable = false)
	@JSONField(format = "yyyy-MM-dd hh:mm:ss")
	private Timestamp createTime;
	
	@Column(name="auth",columnDefinition="varchar(100) COMMENT '用户权限'")
	private String auth;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", userName=" + userName + ", password=" + password + ", createTime=" + createTime
				+ ", auth=" + auth + "]";
	}
	
}
