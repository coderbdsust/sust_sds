package edu.sust.sust_sd.domain;

public class Student {

	private Integer studentId=-1;
	private String studentName;
	private Integer regNo;
	private Double cgpa;

	public Student() {
	}

	public Student(Integer studentId) {
		this.studentId = studentId;
	}

	public Student(Integer studentId, String studentName, Integer regNo,
			Double cgpa) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.regNo = regNo;
		this.cgpa = cgpa;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Integer getRegNo() {
		return regNo;
	}

	public void setRegNo(Integer regNo) {
		this.regNo = regNo;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", regNo=" + regNo + ", cgpa=" + cgpa + "]";
	}

}
