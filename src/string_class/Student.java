package string_class;

import object_class.Employee;

public class Student {
	private String name;
	private int id;
	private char gender;
	private double marks;
	public Student(String name,int id,char gender,double marks) {
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.marks=marks;
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id +" gender "+gender+ ", name=" + name + ", marks=" + marks + "]";
	}
	
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student e=(Student)o;
			return this.id==e.id &&this.marks==e.marks && this.name.equals(e.name) && this.gender==e.gender ;
			}
			return false;
	}
	public int hashCode() {
		return (int)(this.id+this.marks);
	}
}
