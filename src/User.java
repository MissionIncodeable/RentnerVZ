
public class User {
	public User ()
	{
		this.Age = 68;
	}

    public void setFirstName(String firstName) {                    //nur Getter und Setter
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getUsername() {
        return Username;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public int getAge() {
        return Age;
    }

    private int Age;
    private String FirstName;
    private String LastName;
    private String Username;                                      // Prüfen auf Eindeutigkeit
    private String Email;
    private String Password;

    @Override
    public String toString() {
        return "User{" +
                "Age=" + Age +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
