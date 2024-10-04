package DeepVsShallow;


public class Client {
    public static void main(String[] args) {
        Student st = new Student(25, 2020);
        Exam exam = new Exam(1,200);
        st.setEnrollmentExam(exam);

        Batch batch = new Batch("Apr23");
        st.setBatch(batch);
        System.out.println(batch);

        Student st2 = new Student(st);
        Batch batch2 = new Batch("May23");
        st2.setBatch(batch2);
        System.out.println(st2.getBatch());
        st2.setAge(27); //This will only update the age of s2 Object as st and st2 are tow different Objects with two different address
        st2.getEnrollmentExam().setScore(35); //This will update the exam score of both st and st2 as they both are referring to the same exam class

        System.out.println("Ok");
    }
}
