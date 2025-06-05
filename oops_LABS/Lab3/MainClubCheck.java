import java.util.Scanner;

public class MainClubCheck {
    public static void main(String[] args) {
        BITSStudent[] studentBand = new BITSStudent[6];
        studentBand[0] = new FDStudent("Noori", "2020PS4576H", "CS", "96", "2000");
        studentBand[1] = new FDCode("Rohit", "2020PS9876H", "Mech", "98", "UGNS", 3, "C", "C++", "Python");
        studentBand[2] = new FDCodeRobo("Sayani", "2020PS3645H", "Eco", "94", "UG", 2, 3, new String[]{"C", "Matlab"}, "Drones", "Humanoids");
        studentBand[3] = new HDStudent("Maya", "2023TS7656H", "CS", "92,8.45", "PG");
        studentBand[4] = new HDStudent("Kalki", "2023TS8765H", "EC", "91,7.92", "PGGate");
        studentBand[5] = new HDStudent("Harsh", "2023TS3517H", "Math", "97,9.4", "20000");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student to check club memberships:");
        String name = sc.nextLine();
        boolean found = false;

        for (BITSStudent student : studentBand) {
            if (student.name.equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Club memberships for " + student.name + ":");

                if (student instanceof CodingClubMember) {
                    CodingClubMember c = (CodingClubMember) student;
                    System.out.println("- " + c.printClubName());
                }

                if (student instanceof RoboticsClubMember) {
                    RoboticsClubMember r = (RoboticsClubMember) student;
                    System.out.println("- " + r.printRClubName());
                }

                // If needed, you can add more clubs here
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
