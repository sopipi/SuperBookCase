package daotest;

import static org.junit.Assert.*;

import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;


import dao.jdbc;
import entity.User;

public class JDBCTest {

	@Test
	public void mai111n() {
		String sql="SELECT * FROM user WHERE openId = ?";
		System.out.println(jdbc.select(sql, new BeanListHandler<User>(User.class), 1));
		}
	
	@Test
	public void mm() {
	String sql = "insert into `user`(openId,nickName) values(?,?)";
	try {
		jdbc.update(sql,"2","2");
	} catch(Exception e) {
		System.out.println(e);
	}

}
}




