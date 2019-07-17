package cn.itcast.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.domain.Student;
import cn.itcast.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		List<Student> students =studentService.findAll();
		model.addAttribute("students",students);	
		return "students";
	}
	
	@RequestMapping("/saveStudent")
	public void saveStudent(Student student,HttpServletRequest request,HttpServletResponse response) throws IOException {
		studentService.saveStudent(student);
		response.sendRedirect(request.getContextPath()+"/student/findAll");
		
	}
	
	@RequestMapping("/deleteStudent")
	public void deleteStudent(Student student,HttpServletRequest request,HttpServletResponse response) throws IOException {
		studentService.deleteStudent(student);
		response.sendRedirect(request.getContextPath()+"/student/findAll");
		
	}
	//跳转
	@RequestMapping("/operation")
	public String operation() {
		return "operation";
	}

	

}
