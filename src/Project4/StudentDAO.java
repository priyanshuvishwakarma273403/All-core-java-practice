package Project4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public void addStudent(Student s){
        try{
            Connection conn = DBConnection.getConnection();
            String query = "INSERT INTO students(name, course, grade) VALUES(?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(query);
            pstm.setString(1, s.getName());
            pstm.setString(2, s.getCourse());
            pstm.setString(3, s.getGrade());
            pstm.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public List<Student> getAllStudents(){
        List<Student> list = new ArrayList<>();
        try{
            Connection conn = DBConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while(rs.next()){
                Student s = new Student(rs.getString("name"),rs.getString("course"),rs.getString("grade"));
                list.add(s);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
    public void deleteStudent(int s){
        try{
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps=conn.prepareStatement("Delete from students where id =?");
            ps.setInt(1, s);
            ps.executeUpdate();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
