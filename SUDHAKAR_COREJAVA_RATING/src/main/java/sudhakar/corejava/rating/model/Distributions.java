package sudhakar.corejava.rating.model;

import java.util.Objects;

public class Distributions {

	private String test;
	private String quiz;
	private String labWork;
	private String project;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getQuiz() {
		return quiz;
	}

	public void setQuiz(String quiz) {
		this.quiz = quiz;
	}

	public String getLabWork() {
		return labWork;
	}

	public void setLabWork(String labWork) {
		this.labWork = labWork;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public Distributions(String test, String quiz, String labWork, String project) {
		super();
		this.test = test;
		this.quiz = quiz;
		this.labWork = labWork;
		this.project = project;
	}

	public Distributions() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(labWork, project, quiz, test);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distributions other = (Distributions) obj;
		return Objects.equals(labWork, other.labWork) && Objects.equals(project, other.project)
				&& Objects.equals(quiz, other.quiz) && Objects.equals(test, other.test);
	}

	@Override
	public String toString() {
		return "Distributions [test=" + test + ", quiz=" + quiz + ", labWork=" + labWork + ", project=" + project + "]";
	}

}
