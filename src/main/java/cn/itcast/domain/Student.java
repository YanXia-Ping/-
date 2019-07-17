package cn.itcast.domain;

public class Student {
	private String name;
	private Integer id;
	private String school;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", school=" + school + "]";
	}
	
	
}
