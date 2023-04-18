package sudhakar.corejava.rating.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import sudhakar.corejava.rating.model.AssignmentFloat;
import sudhakar.corejava.rating.service.StudentService;

@Component
public class test {

	@Value("${spring.application.name}")
	private static String name = null; 
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		test.name = name;
	}



	public static void main(String[] args) {
		StudentService studentService = new StudentServiceImpl();
		List<AssignmentFloat> assignmentFloats = studentService.getStudentAssignment("Ananth");
		for(int i = 0; i<assignmentFloats.size(); i++) {
			System.out.println(assignmentFloats.get(i));
		}
		System.out.println(getName());
	}

}
