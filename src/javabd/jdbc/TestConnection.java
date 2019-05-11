package javabd.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
	public static void main(String[] args) throws SQLException {
		try(Connection connection = new ConnectionFactory().getConnection()) {
			
		}
	}
}
