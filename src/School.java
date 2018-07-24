public class School {
    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", 4);
        Teacher teacher = new Teacher("Adam", "Nowak", "Matematyka");

        student.show();
        teacher.show();
    }
}
