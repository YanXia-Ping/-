package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.dao.StudentDao;
import cn.itcast.domain.Student;
import cn.itcast.service.StudentService;
@Service("studentService")
public class StudentServiceImpl implements StudentService{


	@Autowired
	private StudentDao studentDao;
	public void saveStudent(Student student) {
		System.out.println("业务层，保存账户");
		studentDao.saveStudent(student);
		// TODO Auto-generated method stub
		
	}

	public List<Student> findAll() {
		// TODO Auto-generated method stub
		System.out.println("业务层，查询所有学生");
		return studentDao.findAll();
	}

	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("业务层，删除学生");
		studentDao.deleteStudent(student);
	}

}
