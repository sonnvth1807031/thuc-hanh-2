package entity;

public class employees {
    private String id;
    private String name;
    private String address;
    private String email;
    private String account;
    private String password;
    private String date_created;
    private String 	update_date;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public employees(){}

    public employees(String id, String name, String address, String email, String account, String password, String date_created, String update_date, String status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.account = account;
        this.password = password;
        this.date_created = date_created;
        this.update_date = update_date;
        this.status = status;
    }
}
