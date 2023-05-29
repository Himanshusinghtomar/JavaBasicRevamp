class Student{
    int roll;
    String name;

}
public class ArrayObject {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Himanshu Singh Tomar";
        st.roll = 82049;

        Student st1 = new Student();
        st1.name = "Anshu Singh";
        st1.roll = 220;

        Student st2 = new Student();
        st2.name = "Raja Choudary";
        st2.roll = 8097;

        Student[] students = new Student[3];

        students[0] = st;
        students[1] = st1;
        students[2] = st2;

        for(Student s : students)
        {
            System.out.println(s.name+ " " +s.roll);
        }

    }
}
