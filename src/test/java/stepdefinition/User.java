package stepdefinition;

public class User {
    private int id;
    private String name;
    private String email;
    private Address address;
    private String phone;
    private String website;

    // Default constructor
    public User() {
    }

    // Constructor with all fields
    public User(int id, String name, String email, Address address, String phone, String website) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
    }

    // Getters and Setters for all fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
    public double getLat() {
        if (address != null && address.getGeo() != null) {
            return Double.parseDouble(address.getGeo().getLat());
        }
        return 0.0; // or throw an exception or handle null case as needed
    }

    public double getLng() {
        if (address != null && address.getGeo() != null) {
            return Double.parseDouble(address.getGeo().getLng());
        }
        return 0.0; // or throw an exception or handle null case as needed
    }

//    // toString method (optional, for debugging purposes)
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", address=" + address +
//                ", phone='" + phone + '\'' +
//                ", website='" + website + '\'' +
//                '}';
//    }
    
    
}
