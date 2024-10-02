package DeepVsShallow;

public class Client {
    public static void main(String[] args) {
        Student st = new Student(25, 2020);
        Exam exam = new Exam(1,200);
        st.setEnrollmentExam(exam);

        Student st2 = new Student(st);

        st2.setAge(27); //This will only update the age of s2 Object as st and st2 are tow different Objects with two different address
        st2.getEnrollmentExam().setScore(35); //This will update the exam score of both st and st2 as they both are referring to the same exam class

        System.out.println("Ok");
    }
}
