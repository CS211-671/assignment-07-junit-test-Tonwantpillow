package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    public void testAddNewStudent(){
        StudentList group1 = new StudentList();
        group1.addNewStudent("6610000", "John");
        group1.addNewStudent("6322222", "Ton", 60.5);
        assertEquals("John", group1.findStudentById("6610000").getName());
        assertEquals(60.5, group1.findStudentById("6322222").getScore());
    }

    @Test
    public void testFindStudentByID(){
        StudentList group1 = new StudentList();
        group1.addNewStudent("6610000", "John");
        group1.addNewStudent("6322222", "Ton", 60);
        assertEquals("Ton", group1.findStudentById("6322222").getName());
    }

    @Test
    public void testGiveScoreToID(){
        StudentList group1 = new StudentList();
        group1.addNewStudent("6610000", "John");
        group1.addNewStudent("6322222", "Ton", 60);
        group1.giveScoreToId("6610000", 50);
        assertEquals(50, group1.findStudentById("6610000").getScore());
    }

    @Test
    public void testViewGradeOfID(){
        StudentList group1 = new StudentList();
        group1.addNewStudent("6610000", "John");
        group1.addNewStudent("6322222", "Ton", 60);
        assertEquals("C", group1.viewGradeOfId("6322222"));
    }

}