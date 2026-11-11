
package maven.maven;

public class GradeCalc {

    public String calculateGrade(int marks) {

        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Invalid marks");
        }

        if (marks >= 90) {
            return "A";
        } 
        else if (marks >= 80) {
            return "B";
        } 
        else if (marks >= 70) {
            return "C";
        } 
        else if (marks >= 60) {
            return "D";
        } 
        else if (marks >= 40) {
            return "E";
        } 
        else {
            return "F";
        }
    }
}
