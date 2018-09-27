package com.empdao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Emp;

public class EmpDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	public int save(Emp e){
		
		String sql="insert into admin(name, password) values('"+e.getName() +"','" +e.getPassword() +"')";
		return template.update(sql);	
	}
	
	public int update(Emp e){
		
		String sql="update admin set name ='"+e.getName() +"',password ='" + e.getPassword()+"'where id ='" + e.getId() + "'";
		
		System.out.println(sql);
		return template.update(sql);
		
	}
	
	public int delete(int id){
		
		String sql = "delete from admin where id ='"+id+"'";
		return template.update(sql);
	}
	
	public Emp getempbyid(int id){
		
		String sql= " Select * from admin where id = ?";
		System.out.println(sql);
		 return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));  
	}

	public List<Emp> getallemp(){
		
		return template.query("select * from admin", new RowMapper<Emp>(){

			@Override
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				// TODO Auto-generated method stub
				Emp e = new Emp();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setPassword(rs.getString("password"));
				return e;
			}
			
		});
	}
}
