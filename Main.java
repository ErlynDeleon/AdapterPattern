public class Main{
    public static void main(String[] args) {
        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp attendanceApp = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp gradingApp = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp libraryApp = new LibrarySystemAdapter(librarySystem);

        System.out.println(attendanceApp.integrateSystem());
        System.out.println(gradingApp.integrateSystem());
        System.out.println(libraryApp.integrateSystem());
        System.out.println();
    }
}