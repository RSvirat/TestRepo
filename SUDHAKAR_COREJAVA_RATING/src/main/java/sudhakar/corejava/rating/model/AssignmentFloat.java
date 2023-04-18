package sudhakar.corejava.rating.model;

import java.util.Objects;

public class AssignmentFloat {

	private String subject;
	private String testScore;
	private String quizScore;
	private String labScore;
	private String projectScore;
	private String overallRating;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTestScore() {
		return testScore;
	}

	public void setTestScore(String testScore) {
		this.testScore = testScore;
	}

	public String getQuizScore() {
		return quizScore;
	}

	public void setQuizScore(String quizScore) {
		this.quizScore = quizScore;
	}

	public String getLabScore() {
		return labScore;
	}

	public void setLabScore(String labScore) {
		this.labScore = labScore;
	}

	public String getProjectScore() {
		return projectScore;
	}

	public void setProjectScore(String projectScore) {
		this.projectScore = projectScore;
	}

	public String getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(String overallRating) {
		this.overallRating = overallRating;
	}

	public AssignmentFloat() {
	}

	public AssignmentFloat(String subject, String testScore, String quizScore, String labScore, String projectScore,
			String overallRating) {
		super();
		this.subject = subject;
		this.testScore = testScore;
		this.quizScore = quizScore;
		this.labScore = labScore;
		this.projectScore = projectScore;
		this.overallRating = overallRating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(labScore, overallRating, projectScore, quizScore, subject, testScore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AssignmentFloat other = (AssignmentFloat) obj;
		return Objects.equals(labScore, other.labScore) && Objects.equals(overallRating, other.overallRating)
				&& Objects.equals(projectScore, other.projectScore) && Objects.equals(quizScore, other.quizScore)
				&& Objects.equals(subject, other.subject) && Objects.equals(testScore, other.testScore);
	}

	@Override
	public String toString() {
		return "AssignmentFloat [subject=" + subject + ", testScore=" + testScore + ", quizScore=" + quizScore
				+ ", labScore=" + labScore + ", projectScore=" + projectScore + ", overallRating=" + overallRating
				+ "]";
	}
	
	

}
