
public class Registry {
	
	public Registry (Userlist _RegistryUserList){							// Konstruktor mit interner Nutzerliste
		this.RegistryUserList = _RegistryUserList;              			
	}
	
	public void RegNewUser (String _FirstName, String _LastName, String _Username, String _Email, String _Password){
		User NewUser = new User(_FirstName, _LastName, _Username, _Email, _Password);        // Registriere neuen User
		this.RegistryUserList.getMyUserlist().add(NewUser);					// schreibe neuen User in Ã¼bergebene Userliste
	}


    public Userlist getRegistryUserList() {									// Getter für Nutzerliste der Registry
        return RegistryUserList;
    }
    public void setRegistryUserList(Userlist newUserList) {					// Setze Userliste der Registry
       this.RegistryUserList = newUserList;
    }

    private Userlist RegistryUserList;                           			// interne Userliste der Registry
}

