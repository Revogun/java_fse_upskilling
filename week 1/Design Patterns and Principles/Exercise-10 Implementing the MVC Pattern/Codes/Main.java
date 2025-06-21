public class Main {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("Revo");
        model.setId("S102");
        model.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Revolution");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
