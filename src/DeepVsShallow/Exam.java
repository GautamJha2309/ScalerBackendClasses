package DeepVsShallow;

public class Exam {
    private int examId;
    private int score;

    Exam(int examId, int score) {
        this.examId = examId;
        this.score = score;
    }

    Exam(Exam other) {
        this.examId = other.examId;
        this.score = other.score;
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
