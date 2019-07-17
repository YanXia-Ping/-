package cn.itcast.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.itcast.domain.Student;
@Repository	
public interface StudentDao {

	//填加学生信息
	@Insert("insert into student (name,id,school) values (#{name},#{id},#{school})")
	public void saveStudent(Student student);
	//查询所有
	@Select("select * from student")
	public List<Student> findAll();
	//更具姓名和学号删除学生信息
	@Delete("delete from student where name=#{name} and id=#{id}")
	public void deleteStudent(Student student);
	
}
