package springbook.user.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
public class DaoFactory {
	
	@Bean
	public UserDao userDao() {
		UserDao dao = new UserDao();
		dao.setDataSource(dataSource());
		return dao;
	}

	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
		dataSource.setUrl("jdbc:mysql://localhost/springbook?characterEncoding=UTF-8");
		dataSource.setUsername("spring");
		dataSource.setPassword("book");
		
		return dataSource;
	}
}
