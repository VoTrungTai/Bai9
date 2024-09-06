package Student;

public class Students {

    int ID;
    String name;

    public Students(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    void displayInformation() {
        System.out.println("ID:" + ID + ", Name:" + name);
    }
}


