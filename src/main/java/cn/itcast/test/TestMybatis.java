package cn.itcast.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.itcast.dao.StudentDao;
import cn.itcast.domain.Student;

public class TestMybatis {

	@Test
	public void run1() throws Exception {
		//加载配置文件
		InputStream in=Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建SqlSessionFactory对象
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession对象
		SqlSession session=factory.openSession();
		//获取到代理对象
		StudentDao studentDao=session.getMapper(StudentDao.class);
		//查询所有数据
		List<Student> list=studentDao.findAll();
		for(Student stu:list) {
			System.out.println(stu);
		}
		session.close();
		in.close();
	}
	@Test
	public void run2() throws Exception {
		Student student=new Student();
		student.setId(2);
		student.setName("木华");
		student.setSchool("cl");
		//加载配置文件
		InputStream in=Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建SqlSessionFactory对象
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession对象
		SqlSession session=factory.openSession();
		//获取到代理对象
		StudentDao studentDao=session.getMapper(StudentDao.class);
		//填加信息
		studentDao.saveStudent(student);
		session.commit();
		session.close();
		in.close();
	}
	@Test
	public void run3() throws Exception {
		Student student=new Student();
		student.setId(2);
		student.setName("木华");
		//加载配置文件
		InputStream in=Resources.getResourceAsStream("SqlMapConfig.xml");
		//创建SqlSessionFactory对象
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
		//创建SqlSession对象
		SqlSession session=factory.openSession();
		//获取到代理对象
		StudentDao studentDao=session.getMapper(StudentDao.class);
		//填加信息
		studentDao.deleteStudent(student);
		session.commit();
		session.close();
		in.close();
	}
}
