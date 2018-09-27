package com.template.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.template.pojo.Admin;

public class AdminDaoPs {

	private JdbcTemplate jdbctemplate;
	

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}


public Boolean  saveAdminByPs(final Admin a){
		
		String sql="insert into admin values(?,?,?)";
		return jdbctemplate.execute(sql,new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				ps.setInt(1, a.getId());
				ps.setString(2, a.getName());
				ps.setString(3, a.getPassword());
				
				return ps.execute();
			}
			
		});
		
	}

}
