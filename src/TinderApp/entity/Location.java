package TinderApp.entity;

public class Location {
    private double latitude;
    private double longitude;

    public Location(){
        latitude = 0.0;
        longitude = 0.0;
    }

    public double getLatitude(){
        return latitude;
    }

    public void getLongitude(double lat){
        latitude = lat;
    }

    public void setLongitude(double lat){
        longitude = lat;
    }

    public double distanceInKm(Location other){
        final double earthRadiusKm = 6371.0;
        double dLat = (other.latitude - latitude) * Math.PI / 180.0;
        double dLon = (other.longitude - longitude) * Math.PI / 180.0;

        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.cos(latitude * Math.PI/ 180.0) * Math.cos(other.latitude * Math.PI / 180.0) *
                        Math.sin(dLon/2) * Math.sin(dLon/2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        return earthRadiusKm * c;
    }
}
