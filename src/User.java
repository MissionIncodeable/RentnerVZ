
public class User {
	public User (String _FirstName, String _LastName, String _Username, String _Email, String _Password)
	{
		this.Age 		= 68;
		this.FirstName 	= _FirstName;
		this.LastName 	=  _LastName;
		this.Username 	= _Username;
		this.Email 		= _Email;
		this.Password 	= _Password;
	}

    public void setFirstName(String _FirstName) {                    // Get+Set Vorname
        FirstName = _FirstName;
    }
    public String getFirstName() {
        return FirstName;
    }
    
    public void setLastName(String _LastName) {						// Get+Set Nachname
        LastName = _LastName;
    }
    public String getLastName() {
        return LastName;
    }
    
    public void setUsername(String _Username) {						// Get+Set Nickname
        Username = _Username;
    }
    public String getUsername() {
        return Username;
    }

    public void setEmail(String _Email) {							// Get+Set Email
        Email = _Email;
    }
    public String getEmail() {
        return Email;
    }
    
    public void setPassword(String _Password) {						// Get+Set Passwort
        Password = _Password;
    }
    public String getPassword() {									
        return Password;
    }
    
    public void setAge(int _Age) {									// Get+Set Alter
        Age = _Age;
    }
    public int getAge() {
        return Age;
    }
    
    @Override
    public String toString() {										// Ausgabe aller Attribute als Text
        return "User{" +
                "Age=" + Age +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Username='" + Username + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
    
    private int Age;												// Private Variablen von User
    private String FirstName;
    private String LastName;
    private String Username;                                     
    private String Email;
    private String Password;
}
