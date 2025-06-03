package dto;

public class Account {

    private final String name;
    private final String phone;
    private final String fax;
    private final String rating;
    private final String website;
    private final String account_site;
    private final String ticker_symbol;
    private final String type;
    private final String ownership;
    private final String industry;
    private final String employees;
    private final String annual_revenue;
    private final String sic_code;
    private final String billing_street;
    private final String billing_city;
    private final String billing_state_province;
    private final String billing_zip_postal_code;
    private final String billing_country;
    private final String shipping_street;
    private final String shipping_city;
    private final String shipping_state_province;
    private final String shipping_zip_postal_code;
    private final String shipping_country;
    private final String customer_priority;
    private final String sla;
    private final String sla_serial_number;
    private final String number_of_location;
    private final String upsell_opportunity;
    private final String active;
    private final String description;


    public Account(String name, String phone, String fax, String rating,
                   String website, String account_site, String ticker_symbol,
                   String type, String ownership, String industry, String employees,
                   String annual_revenue, String sic_code,
                   String billing_street, String billing_city, String billing_state_province,
                   String billing_zip_postal_code, String billing_country, String shipping_street,
                   String shipping_city, String shipping_state_province, String shipping_zip_postal_code,
                   String shipping_country, String customer_priority, String sla,
                   String sla_serial_number, String number_of_location,
                   String upsell_opportunity, String active, String description) {
        this.name = name;
        this.phone = phone;
        this.fax = fax;
        this.rating = rating;
        this.website = website;
        this.account_site = account_site;
        this.ticker_symbol = ticker_symbol;
        this.type = type;
        this.ownership = ownership;
        this.industry = industry;
        this.employees = employees;
        this.annual_revenue = annual_revenue;
        this.sic_code = sic_code;
        this.billing_street = billing_street;
        this.billing_city = billing_city;
        this.billing_state_province = billing_state_province;
        this.billing_zip_postal_code = billing_zip_postal_code;
        this.billing_country = billing_country;
        this.shipping_street = shipping_street;
        this.shipping_city = shipping_city;
        this.shipping_state_province = shipping_state_province;
        this.shipping_zip_postal_code = shipping_zip_postal_code;
        this.shipping_country = shipping_country;
        this.customer_priority = customer_priority;
        this.sla = sla;
        this.sla_serial_number = sla_serial_number;
        this.number_of_location = number_of_location;
        this.upsell_opportunity = upsell_opportunity;
        this.active = active;
        this.description = description;
    }


    public String getAccount_site() {
        return account_site;
    }

    public String getActive() {
        return active;
    }

    public String getAnnual_revenue() {
        return annual_revenue;
    }

    public String getBilling_city() {
        return billing_city;
    }

    public String getBilling_country() {
        return billing_country;
    }

    public String getBilling_state_province() {
        return billing_state_province;
    }

    public String getBilling_street() {
        return billing_street;
    }

    public String getBilling_zip_postal_code() {
        return billing_zip_postal_code;
    }

    public String getCustomer_priority() {
        return customer_priority;
    }

    public String getDescription() {
        return description;
    }

    public String getEmployees() {
        return employees;
    }

    public String getIndustry() {
        return industry;
    }

    public String getNumber_of_location() {
        return number_of_location;
    }

    public String getOwnership() {
        return ownership;
    }

    public String getShipping_city() {
        return shipping_city;
    }

    public String getShipping_country() {
        return shipping_country;
    }

    public String getShipping_state_province() {
        return shipping_state_province;
    }

    public String getShipping_street() {
        return shipping_street;
    }

    public String getShipping_zip_postal_code() {
        return shipping_zip_postal_code;
    }

    public String getSic_code() {
        return sic_code;
    }

    public String getSla() {
        return sla;
    }

    public String getSla_serial_number() {
        return sla_serial_number;
    }

    public String getTicker_symbol() {
        return ticker_symbol;
    }

    public String getType() {
        return type;
    }

    public String getUpsell_opportunity() {
        return upsell_opportunity;
    }

    public String getWebsite() {
        return website;
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
