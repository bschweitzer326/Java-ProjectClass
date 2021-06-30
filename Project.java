public class Project{
    private String name;
    private String description;
    // constructors
    public Project() {

    }
    
    public Project(String name) {
        this.name = name;
    }
    
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    // getters
    public String getname() {
        return this.name;
    }
    public String getdescription() {
        return this.description;
    }

    // setters
    public void setname(String name) {
        this.name = name;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    // action method
    public void elevatorPitch() {
        System.out.println(this.name + ":" + this.description);
    }
}




