package DeepVsShallow;

public class ReattemptExam {
    private int examId;

    ReattemptExam(int examId) {
        this.examId = examId;
    }

    ReattemptExam(ReattemptExam exam) {
        this.examId = exam.examId;
    }

    public int getExamId() {
        return examId;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }
}
