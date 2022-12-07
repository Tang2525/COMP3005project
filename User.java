public class User{
    String name;
    String addressInfo;
    String username;
    String password;


    public User(){
        this.name = "guest";
    }

    public User(String n,String address, String usern, String p){
        this.name = n;
        this.addressInfo = address;
        this.username = usern;
        this.password = p;
    }
}

