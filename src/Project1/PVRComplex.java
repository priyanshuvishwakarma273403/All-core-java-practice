package Project1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class PVRComplex {
    private static final String url =  "jdbc:mysql://localhost:3306/Practice";
    private static final String user = "root";
    private static final String password = "pop99558$$";


    public static void main(String[] args) throws ClassNotFoundException, SQLException ,InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =  DriverManager.getConnection(url,user,password);

        Scanner sc = new Scanner(System.in);
        con.setAutoCommit(false);

        MovieService service = new MovieService(con);

        boolean exit = false;
        while(!exit){
            System.out.println("""
                    ───────────── Movie Menu ─────────────
                    [1] ➤ Add Movie
                    [2] ➤ Remove Movie
                    [3] ➤ Search Movie
                    [4] ➤ Display All Movies
                    [5] ➤ Exit
                    ─────────────────────────────────────
                    """);
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                sc.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movieName = sc.nextLine();
                    System.out.print("Enter Movie Duration: ");
                    String duration  = sc.nextLine();
                     Movies movies = new Movies(movieName,duration);
                     boolean added = service.addMovie(movies);
                    System.out.println(added ? "Movie Added Successfully!!!\n" : "Movie Add Failed!");
                    break;

                case 2:
                    System.out.print("Enter Movie ID: ");
                    int movieId = sc.nextInt();
                    System.out.println("------------------------------------");
                    boolean removed = service.removeMovie(movieId);
                    System.out.println(removed ? "Movie Removed Successfully!!!\n" : "Movie Removed Failed!");
                    break;

                case 3:
                     System.out.print("Enter Movie ID: ");
                     int movieId2 = sc.nextInt();
                     System.out.println("------------------------------------");
                     Movies found = service.searchMovie(movieId2);
                     if(found!=null){
                         System.out.printf("%-10s %-25s %-10s %-15s %n","Movie ID",
                                 "Movie Name","Duration","UploadedAt");
                         System.out.println(found);
                     }
                     else{
                         System.out.println("Movie not found!");
                     }
                    System.out.println("--------------------------------------\n");
                     break;

                     case 4:
                         List<Movies> arr = service.displayMovies();
                         if(arr.isEmpty()){
                             System.out.println("No movies found in database!!! ");
                         }
                         else{
                             System.out.printf("%-10s %-25s %-10s %-15s %n","Movie ID",
                                     "Movie Name","Duration","UploadedAt");
                             System.out.println("-----------------------------------------------------");

                             for(Movies ele : arr){
                                 System.out.println(ele);
                             }
                             System.out.println("------------------------------------------------------");
                             System.out.println("Total Movies: "+arr.size()+"\n");
                         }
                         break;

                         case 5:
                             exit = true;
                             break;
                             default:
                                 System.out.println("Invalid choice!");
                                 break;
            }
        }
        con.close();
        sc.close();
        System.out.println("Program Ended!! ");

    }
}
