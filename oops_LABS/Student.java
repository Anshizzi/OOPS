//constructor = Student 
public class Student {
    String name;
    String ID;
    double CGPA;
    String campus;
    public Student(String n, String i, double c){
        this.name = n;
        this.ID = i;
        this.CGPA = c;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double cGPA) {
        CGPA = cGPA;
    }
    
    public String getCampus(){
        return ID.substring(ID.length() - 1);
    }
    
    public void setCampus(String campus) {
        this.campus = campus;
    }
    public Object getStudentPincode() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentPincode'");
    }
}