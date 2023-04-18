package sudhakar.corejava.rating.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import sudhakar.corejava.rating.model.Assignements2;
import sudhakar.corejava.rating.model.AssignmentFloat;
import sudhakar.corejava.rating.model.Assignments;
import sudhakar.corejava.rating.model.Distributions;
import sudhakar.corejava.rating.service.StudentService;

public class StudentServiceImpl  {

	
	public void insertRecord() {
		
	}

	public static void main (String args[]) {
		List<AssignmentFloat> list = getStudentAssignment("Bhagath");
		for(AssignmentFloat assignmentFloat: list) {
			System.out.println(assignmentFloat);
		}
	}
	
	
	public static List<AssignmentFloat> getStudentAssignment(String student) {
		Distributions distributions = new Distributions("test", "quiz", "lab", "project");
		List<Assignments> assignmentsList = new ArrayList<>();
		List<Assignements2> assignements2s = new ArrayList<>();
		double testEletro = 0;
		double testcomputing = 0;
		double quizEletro = 0;
		double quizComputing = 0;
		double projectElectro = 0;
		double projectComputing = 0;
		double labElectro = 0;
		double labComputing = 0;
		double overAllRatingElectro = 0;
		double overAllRatingComputing = 0;
		assignmentsList.add(new Assignments(1, "Ananth", "Electro Fields", "test_1", "21-Jul-16", 100));
		assignmentsList.add(new Assignments(2, "Bhagath", "Electro Fields", "test_1", "21-Jul-16", 78));
		assignmentsList.add(new Assignments(3, "Chaya", "Electro Fields", "test_1", "21-Jul-16", 68));
		assignmentsList.add(new Assignments(4, "Esharath", "Electro Fields", "test_1", "21-Jul-16", 87));
		assignmentsList.add(new Assignments(5, "Bhagath", "Electro Fields", "quiz_1", "22-Jul-16", 20));
		assignmentsList.add(new Assignments(6, "Chaya", "Electro Fields", "lab_1", "23-Jul-16 ", 10));
		assignmentsList.add(new Assignments(7, "Ananth", "Electro Fields", "project_1", "21-Jul-16", 100));
		assignmentsList.add(new Assignments(8, "Davanth", "Electro Fields", "project_1", "21-Jul-16", 100));
		assignmentsList.add(new Assignments(9, "Bhagath", "Electro Fields", "quiz_2", "21-Jul-16", 50));
		assignmentsList.add(new Assignments(10, "Ananth ", "Electro Fields", "quiz_1", "21-Jul-16", 100));
		assignmentsList.add(new Assignments(11, "Ananth", "Computing Techniques", "test_1", "21-Jul-16", 86));
		assignmentsList.add(new Assignments(12, "Ananth", "Electro Fields", "quiz_2", "21-Jul-16", 100));
		assignmentsList.add(new Assignments(13, "Bhagath", "Computing Techniques", "test_1", "21-Jul-16", 100));
		assignmentsList.add(new Assignments(14, "Chaya", "Computing Techniques", "test_1", "21-Jul-16", 20));
		assignmentsList.add(new Assignments(15, "Chaya", "Electro Fields", "test_2", "21-Jul-16", 92));
		assignmentsList.add(new Assignments(16, "Ananth", "Electro Fields", "test_2", "21-Jul-16", 100));
		assignmentsList.add(new Assignments(16, "Ananth", "Electro Fields", "lab_1", "21-Jul-16", 100));
		
		List<Assignments> resultList = assignmentsList.stream().filter(line -> student.equals(line.getStudentName()))
				.collect(Collectors.toList());
	
		List<Assignments> testListAndElectroFields = resultList.stream()
				.filter(resultLine -> resultLine.getAssignmentCategory().contains(distributions.getTest())
						&& "Electro Fields".equals(resultLine.getSubject()))
				.collect(Collectors.toList());
		
		List<Assignments> testListAndComputingTechniques = resultList.stream()
				.filter(resultLine -> resultLine.getAssignmentCategory().contains(distributions.getTest())
						&& "Computing Techniques".equals(resultLine.getSubject()))
				.collect(Collectors.toList());

		List<Assignments> quizListAndElectroFields = resultList.stream()
				.filter(resultLine -> resultLine.getAssignmentCategory().contains(distributions.getQuiz())
						&& "Electro Fields".equals(resultLine.getSubject()))
				.collect(Collectors.toList());
		
		List<Assignments> quizListAndComputingTechniques = resultList.stream()
				.filter(resultLine -> resultLine.getAssignmentCategory().contains(distributions.getQuiz())
						&& "Computing Techniques".equals(resultLine.getSubject()))
				.collect(Collectors.toList());
		
		List<Assignments> labAndElectroFields = resultList.stream()
				.filter(resultLine -> resultLine.getAssignmentCategory().contains(distributions.getLabWork())
						&& "Electro Fields".equals(resultLine.getSubject()))
				.collect(Collectors.toList());
		
		List<Assignments> labAndComputingTechniques = resultList.stream()
				.filter(resultLine -> resultLine.getAssignmentCategory().contains(distributions.getLabWork())
						&& "Computing Techniques".equals(resultLine.getSubject()))
				.collect(Collectors.toList());
		
		List<Assignments> projectAndElectroFields = resultList.stream()
				.filter(resultLine -> resultLine.getAssignmentCategory().contains(distributions.getProject())
						&& "Electro Fields".equals(resultLine.getSubject()))
				.collect(Collectors.toList());
		
		List<Assignments> projectAndComputingTechniques = resultList.stream()
				.filter(resultLine -> resultLine.getAssignmentCategory().contains(distributions.getProject())
						&& "Computing Techniques".equals(resultLine.getSubject()))
				.collect(Collectors.toList());
		
		testEletro = testListAndElectroFields.size() == 0 ? 0
				: testListAndElectroFields.stream()
						.mapToDouble((a) -> (40 / testListAndElectroFields.size()) * a.getPoint()).sum();
		testEletro = testEletro / 100;
		
		testcomputing = testListAndComputingTechniques.size() == 0 ? 0
				: testListAndComputingTechniques.stream()
						.mapToDouble((a) -> (40 / testListAndComputingTechniques.size()) * a.getPoint()).sum();
		testcomputing = testcomputing / 100;
		
		quizEletro = quizListAndElectroFields.size() == 0 ? 0
				: quizListAndElectroFields.stream()
						.mapToDouble((a) -> (20 / quizListAndElectroFields.size()) * a.getPoint()).sum();
		quizEletro = quizEletro/100;
		
		quizComputing = quizListAndComputingTechniques.size() == 0 ? 0
				: quizListAndComputingTechniques.stream()
						.mapToDouble((a) -> (20 / quizListAndComputingTechniques.size()) * a.getPoint()).sum();
		quizComputing = quizComputing/100;
		
		labElectro = labAndElectroFields.size() == 0 ? 0
				: labAndElectroFields.stream().mapToDouble((a) -> (10 / labAndElectroFields.size()) * a.getPoint())
						.sum();
		labElectro = labElectro/100;
		
		labComputing = labAndComputingTechniques.stream()
				.mapToDouble((a) -> (10 / labAndComputingTechniques.size()) * a.getPoint()).sum();
		labComputing = labComputing/100;
		
		projectElectro = projectAndElectroFields.stream()
				.mapToDouble((a) -> (30 / projectAndElectroFields.size()) * a.getPoint()).sum();
		projectElectro = projectElectro/100;
		
		projectComputing = projectAndComputingTechniques.stream()
				.mapToDouble((a) -> (30 / projectAndComputingTechniques.size()) * a.getPoint()).sum();
		projectComputing = projectComputing/100;
		
		overAllRatingElectro = testEletro + quizEletro + labElectro + projectElectro;
		overAllRatingComputing = testcomputing + quizComputing + labComputing + projectComputing;
		
		List<AssignmentFloat> assignmentFloats = new ArrayList<AssignmentFloat>();
		assignmentFloats.add(new AssignmentFloat("Electro Fields", String.valueOf(testEletro), String.valueOf(quizEletro), String.valueOf(labElectro), String.valueOf(projectElectro), String.valueOf(overAllRatingElectro)));
		assignmentFloats.add(new AssignmentFloat("Computing Techniques", String.valueOf(testcomputing), String.valueOf(quizComputing), String.valueOf(labComputing), String.valueOf(projectComputing), String.valueOf(overAllRatingComputing)));
		return assignmentFloats;
	}
}
