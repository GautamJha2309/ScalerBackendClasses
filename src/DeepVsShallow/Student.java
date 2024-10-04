package DeepVsShallow;

public class Student {
    private int age;
    private int gradYear;
    private Exam enrollmentExam;
    private Batch batch;

    Student(int age, int gradYear) {
        this.age = age;
        this.gradYear =gradYear;
    }

    Student(Student other) {
        this.age = other.age;
        this.gradYear = other.gradYear;
        this.enrollmentExam = other.enrollmentExam; // Shallow copy
        // Shallow copy is used here because i want the student to be in same batch
        // So, I should not create a new batch. I will be calling the same batch
        this.batch = other.batch;
    }

//    Following is the example of DeepCopy. Here different exam object will be created for differeint student object
//    Student(Student other) {
//        this.age = other.age;
//        this.gradYear = other.gradYear;
//        this.enrollmentExam = new Exam(other.enrollmentExam); // Deep copy
//        //                  OR
//        this.enrollmentExam = new Exam(other.enrollmentExam.getExamId(), other.enrollmentExam.getScore()); // Deep copy
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public Exam getEnrollmentExam() {
        return enrollmentExam;
    }

    public void setEnrollmentExam(Exam enrollmentExam) {
        this.enrollmentExam = enrollmentExam;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }
}
