package sudhakar.corejava.rating.model;

import java.util.Objects;

public class Assignments {

	private int serialNo;
	private String studentName;
	private String subject;
	private String assignmentCategory;
	private String dateOfSubmission;
	private int point;
	
	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAssignmentCategory() {
		return assignmentCategory;
	}

	public void setAssignmentCategory(String assignmentCategory) {
		this.assignmentCategory = assignmentCategory;
	}

	public String getDateOfSubmission() {
		return dateOfSubmission;
	}

	public void setDateOfSubmission(String dateOfSubmission) {
		this.dateOfSubmission = dateOfSubmission;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	

	public Assignments(int serialNo, String studentName, String subject, String assignmentCategory,
			String dateOfSubmission, int point) {
		super();
		this.serialNo = serialNo;
		this.studentName = studentName;
		this.subject = subject;
		this.assignmentCategory = assignmentCategory;
		this.dateOfSubmission = dateOfSubmission;
		this.point = point;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(assignmentCategory, dateOfSubmission, point, serialNo, studentName, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Assignments other = (Assignments) obj;
		return Objects.equals(assignmentCategory, other.assignmentCategory)
				&& Objects.equals(dateOfSubmission, other.dateOfSubmission) && point == other.point
				&& serialNo == other.serialNo && Objects.equals(studentName, other.studentName)
				&& Objects.equals(subject, other.subject);
	}

	
	@Override
	public String toString() {
		return "Assignments [serialNo=" + serialNo + ", studentName=" + studentName + ", subject=" + subject
				+ ", assignmentCategory=" + assignmentCategory + ", dateOfSubmission=" + dateOfSubmission + ", point="
				+ point + "]";
	}

	public Assignments() {
	}

}
