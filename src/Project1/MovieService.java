package Project1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MovieService {
    private final MoviesDAO dao;
    public MovieService(Connection conn){
        this.dao = new MoviesDAO(conn);
    }
    public boolean addMovie(Movies movies){
        try{
            if(movies.getMovieName().isBlank() || movies.getDuration().isBlank()){
                System.out.println("Movie Name or Duration can't be empty");
               return false;
            }
            return dao.addMovies(movies);
        }
        catch (SQLException e){
            System.out.println("Database error while adding movie: "+e.getMessage());
            return false;
        }
    }
    public boolean removeMovie(int movieId){
        try{
            return dao.removeMovies(movieId);
        }
        catch (SQLException e){
            System.out.println("Database error while removing movie: "+e.getMessage());
        }
        return false;
    }
    public Movies searchMovie(int movieId){
        try{
            return dao.searchMovies(movieId);
        }
        catch (SQLException e){
            System.out.println("Database error while searching movie: "+e.getMessage());
        }
        return null;
    }
    public List<Movies> displayMovies(){
        try{
            return dao.displayMovies();
        }
        catch (SQLException e){
            System.out.println("Database error while displaying movies: "+e.getMessage());
            return List.of();
        }
    }
}
