package DeepVsShallow;

public class Exam {
    private int examId;
    private int score;
    private ReattemptExam reattemptExam;

    Exam(int examId, int score) {
        this.examId = examId;
        this.score = score;
        this.reattemptExam = new ReattemptExam(examId);
    }

    Exam(Exam other) {
        this.examId = other.examId;
        this.score = other.score;
        // Shallow Copy
        this.reattemptExam = other.reattemptExam;
        // Deep Copy
        this.reattemptExam = new ReattemptExam((other.reattemptExam));
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
