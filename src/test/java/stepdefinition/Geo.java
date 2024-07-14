package stepdefinition;

public class Geo {
    private String lat;
    private String lng;

    // Default constructor
    public Geo() {
    }

    // Constructor with all fields
    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    // Getters and Setters for all fields

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

//    // toString method (optional, for debugging purposes)
//    @Override
//    public String toString() {
//        return "Geo{" +
//                "lat='" + lat + '\'' +
//                ", lng='" + lng + '\'' +
//                '}';
//    }
    
    
}

