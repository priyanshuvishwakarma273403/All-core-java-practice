package Project1;

public class Movies {
    private int movieId;
    private String movieName;
    private String duration;
    private String uploadedAt;

    public Movies(){}

    public Movies(String movieName,String duration){
        this.movieName=movieName;
        this.duration=duration;
    }
    public Movies(int movieId,String movieName,String duration,String uploadedAt){
        this.movieId=movieId;
        this.movieName=movieName;
        this.duration=duration;
        this.uploadedAt=uploadedAt;
    }
    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movieId){
        this.movieId=movieId;
    }
    public String getMovieName(){
        return movieName;
    }
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public String getDuration(){
        return duration;
    }
    public void setDuration(String duration){
        this.duration=duration;
    }
    public String getUploadedAt(){
        return uploadedAt;
    }
    public void setUploadedAt(String uploadedAt){
        this.uploadedAt=uploadedAt;
    }

    @Override
    public String toString(){
        return String.format("%-10s %-25s %-10s %-15s %n",movieId,movieName,duration,uploadedAt);
    }
}
