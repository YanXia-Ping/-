package cn.itcast.service;

import java.util.List;

import cn.itcast.domain.Student;

public interface StudentService {

	//填加学生信息
		public void saveStudent(Student student);
		//查询所有
		public List<Student> findAll();
		//更具姓名和学号删除学生信息
		public void deleteStudent(Student student);
}
