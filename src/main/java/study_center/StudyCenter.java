package study_center;

import study_center.persons.Student;
import study_center.reports.LongReport;
import study_center.reports.Report;
import study_center.reports.ShortReport;

public class StudyCenter {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Ivanov");
        Course java = new Course("Java", 16);
        Course js = new Course("JavaScript", 10);
        Program program = new Program("07/07/2020 10:00", "Programming");
        Course[] courses = new Course[] {java, js};
        program.addCoursesToProgram(courses);
        ivan.setStudentsProgram(program);
        program.calculateProgramEndDate();
        System.out.println("---------Short Report--------");
        Report shortReport = new ShortReport();
        shortReport.showReportForStudent(ivan);
        System.out.println("---------Long Report---------");
        Report longReport = new LongReport();
        longReport.showReportForStudent(ivan);
    }
}
