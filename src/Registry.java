
public class Registry {
	
	public Registry (Userlist _RegistryUserList){
		this.RegistryUserList = _RegistryUserList;              //Konstruktor mit übergebener Userliste
	}
	
	public void RegNewUser (String _FirstName, String _LastName, String _Username, String _Email, String _Password){
		User NewUser = new User();                              // Registriere neuen User
		NewUser.FirstName = _FirstName;
		NewUser.LastName = _LastName;
		NewUser.Username = _Username;
		NewUser.Email = _Email;
		NewUser.Password = _Password;
		this.RegistryUserList.getNewUserlist().add(NewUser);   // schreibe neuen User in übergebene Userliste
	}


    public Userlist getNewUserList() {
        return RegistryUserList;
    }

    public void setNewUserList(Userlist newUserList) {
       RegistryUserList = newUserList;
    }

    private Userlist RegistryUserList;                           // interne Userliste der Registry
}

