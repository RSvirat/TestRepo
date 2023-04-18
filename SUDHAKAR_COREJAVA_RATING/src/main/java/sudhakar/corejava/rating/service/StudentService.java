package sudhakar.corejava.rating.service;

import java.util.List;

import sudhakar.corejava.rating.model.AssignmentFloat;

public interface StudentService {
	public void insertRecord();
	public List<AssignmentFloat> getStudentAssignment(String student);
}
