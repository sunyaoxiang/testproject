package study.standardmodel.java;

public class Employee {
    private String name;
    private String type;
    private String status;

    public Employee(String name, String type, String status) {
        this.name = name;
        this.type = type;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Employe name: " + name
                + ", type: " + type
                + ", status: " + status;
    }
}
