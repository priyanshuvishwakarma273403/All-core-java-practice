package Project1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MoviesDAO {
    private Connection con;
    public MoviesDAO(Connection con) {
        this.con = con;
    }
    public boolean addMovies(Movies movies) throws SQLException {
        String query = "INSERT into movies(movieName,duration) VALUES(?,?)";
        try(PreparedStatement pstmt = con.prepareStatement(query)){
            pstmt.setString(1,movies.getMovieName());
            pstmt.setString(2,movies.getDuration());
             int rows = pstmt.executeUpdate();

             if(rows>0){
                 con.commit();
                 return true;
             }
             else{
                 con.rollback();
                 return false;
             }
        }
    }
    public boolean removeMovies(int movieId) throws SQLException {
        String query = "DELETE from movies where movieId=?";
        try(PreparedStatement pstmt = con.prepareStatement(query)){
            pstmt.setInt(1,movieId);
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                con.commit();
                return true;
            }
            else{
                con.rollback();
                return false;
            }
        }
    }
    public Movies searchMovies(int movieId) throws SQLException {
        String query = "SELECT * from movies where movieId=?";
        try(PreparedStatement pstmt = con.prepareStatement(query)){
            pstmt.setInt(1,movieId);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return new Movies(rs.getInt("movieId"),
                        rs.getString("movieName"),
                        rs.getString("Duration"),
                        rs.getString("UploadedAt")

                );
            }
        }
        return null;
    }
    public List<Movies> displayMovies() throws SQLException{
        List<Movies> arr = new ArrayList<>();
        String query = "SELECT * FROM movies;";

        try(PreparedStatement ps = con.prepareStatement(query)){
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                arr.add(new Movies(
                        rs.getInt("movieId"),
                        rs.getString("movieName"),
                        rs.getString("duration"),
                        rs.getString("uploadedAt")
                ));
            }
        }
        return arr;
    }
}
