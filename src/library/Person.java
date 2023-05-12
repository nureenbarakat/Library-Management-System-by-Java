package library.management.system.pkg1;

public class Person {
  private String name;
  private String email;
  private String mobile;
  private String password;

    public Person(String name, String email, String mobile, String password) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }

    public Person() {
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
  
    @Override
    public String toString() {
        return "Welcome: " + name ;
    }
    @Override
    public boolean equals(Object o) {
      return ((Person)o).getMobile().equals(mobile)&& ((Person)o).getPassword().equals(password);
    }  
}
