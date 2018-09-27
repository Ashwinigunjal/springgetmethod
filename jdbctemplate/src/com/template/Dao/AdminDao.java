package com.template.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.template.pojo.Admin;

public class AdminDao {

	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public int save(Admin a){
		
		String sql = "insert into admin values('" + a.getId()+"','"+a.getName()+"','"+a.getPassword()+"')";  
		
		return jdbctemplate.update(sql);
		
	}
	public int updateadmin( Admin a){
		String sql= "update admin set name ='"+a.getName()+"',password='"+a.getPassword()+"'where id ='"+a.getId()+"'";
		return jdbctemplate.update(sql);
	}

	public int deleteadmin(int i){
		String sql = "delete from admin where id ='"+i+"'";
		return jdbctemplate.update(sql);
		
	}
	
}


