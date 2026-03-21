package Project2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public void addStudent(Students students) throws SQLException, ClassNotFoundException {
       String query = "Insert into students (name,age,course,grade ) values (?,?,?,?)";
       try(Connection con = DBConnection.getConnection();
           PreparedStatement ps = con.prepareStatement(query)){
           ps.setString(1, students.getName());
           ps.setInt(2, students.getAge());
           ps.setString(3, students.getCourse());
           ps.setString(4, students.getGrade());
           ps.executeUpdate();
       }
    }
    public List<Students> getAllStudents() throws SQLException, ClassNotFoundException {
        List<Students> arr = new ArrayList<>();
        String query = "Select * from students";

        try(Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query)){
            while(rs.next()){
                Students students = new Students();
                students.setName(rs.getString("name"));
                students.setAge(rs.getInt("age"));
                students.setCourse(rs.getString("course"));
                students.setGrade(rs.getString("grade"));
                arr.add(students);
            }
        }
        return arr;
    }
    public void updateStudent(int id,String newGrade) throws SQLException, ClassNotFoundException {
        String query = "Update students set grade = ? where id = ?";
        try(Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(query)){
            ps.setString(1,newGrade);
            ps.setInt(2,id);
            ps.executeUpdate();
        }
    }
    public void deleteStudent(int id) throws SQLException, ClassNotFoundException {
        String query = "Delete from students where id = ?";
        try(Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1,id);
            ps.executeUpdate();
        }
    }
}
