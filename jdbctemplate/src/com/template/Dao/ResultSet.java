package com.template.Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.template.pojo.Admin;;
public class ResultSet {

	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public List<Admin> gellAllData(){
		return jdbctemplate.query("Select * from admin", new ResultSetExtractor<List<Admin>>(){

			@Override
			public List<Admin> extractData(java.sql.ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				List<Admin> list =new ArrayList<Admin>();
				while(rs.next()){
					Admin a = new Admin();
					a.setId(rs.getInt("id"));
					a.setName(rs.getString("name"));
					a.setPassword(rs.getString("password"));
					list.add(a);
				}
				return list;
			}
			
		});
	}
		
	
	
	
}
