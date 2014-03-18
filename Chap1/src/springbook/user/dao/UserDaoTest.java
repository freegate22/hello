package springbook.user.dao;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springbook.user.domain.User;

public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("./applicationContext.xml");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextClassPath.xml", UserDao.class);
		
		UserDao dao = context.getBean("userDao", UserDao.class);
		User user = new User();
		user.setId("wh" + String.valueOf(new Date().getTime()).substring(5));
		user.setName("hong gil dong");
		user.setPassword("married");

		dao.add(user);
			
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + " 조회 성공");
	}
}
