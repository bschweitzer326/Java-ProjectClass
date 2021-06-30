public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Name");
        Project project3 = new Project("Name", "Description");
        project1.setname("Roger");
        project1.elevatorPitch();
        project2.elevatorPitch();
        project3.elevatorPitch();
    }
}
