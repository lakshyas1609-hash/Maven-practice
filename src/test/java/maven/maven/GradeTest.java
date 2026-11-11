
package maven.maven;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GradeTest {

    GradeCalc gc = new GradeCalc();

    @Test
    public void testGradeA() {
        assertEquals("A", gc.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", gc.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", gc.calculateGrade(75));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", gc.calculateGrade(65));
    }

    @Test
    public void testGradeE() {
        assertEquals("E", gc.calculateGrade(45));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", gc.calculateGrade(30));
    }

    @Test
    public void testInvalidMarks() {
        assertThrows(IllegalArgumentException.class,
                () -> gc.calculateGrade(110));
    }
}
