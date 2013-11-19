import java.util.LinkedList;
import java.util.List;

public class Userlist {
	public List <User> getNewUserlist() {
		return NewUserlist;
	}

	public void setNewUserlist(List <User> newUserlist) {
		NewUserlist = newUserlist;
	}

    public User getUserFromList(String _LoginUsername)
    {
        for ( User u : NewUserlist )
        {
            if( u.getUsername().equals( _LoginUsername) )
            {
                // gefunden
            }
        }

    }

    private List <User> NewUserlist = new LinkedList <User>();              // Erstelle verkettete Liste von Usern

}
