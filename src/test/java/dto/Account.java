package dto;

public class Account {

    private String name;
    private String phone;
    private String fax;
    private String rating;

    public Account(String fax, String name, String phone, String rating) {
        //this.fax = fax;
        this.name = name;
        this.phone = phone;
        this.rating = rating;
    }

    public String getFax() {
        return fax;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getRating() {
        return rating;
    }
}
