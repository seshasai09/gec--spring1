package dao;


import org.springframework.stereotype.Component;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

@Component
public class ServiceDao {
	
	@Autowired
	private JdbcTemplate template;
	
	public boolean AddEntry(String req){
		String insertSql = "insert into test (name,time) values(?,?)";
		return template.update(insertSql, req,new Date())>0?true:false;
	}

}
