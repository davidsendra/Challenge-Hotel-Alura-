package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
public DataSource datasource;


public ConnectionFactory() {
	ComboPooledDataSource comboPool = new ComboPooledDataSource();
	comboPool.setJdbcUrl("jdbc:mysql://localhost/hotel2?serverTimezone=UTC&useLegacyDatetimeCode=false");
	comboPool.setUser("root");
	comboPool.setPassword("");
	
	this.datasource = comboPool;
}
public Connection recuperarConexion() {
	try {
		return this.datasource.getConnection();
	} catch (SQLException e) {
		throw new RuntimeException(e);
	}
}
}
