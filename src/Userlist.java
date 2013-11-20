import java.util.LinkedList;											 	// Importiere LinkedList-Funktionen
import java.util.List;

public class Userlist {
	public List <User> getMyUserlist() {									// Getter+Setter für Nutzer-Liste
		return MyUserlist;
	}
	public void setMyUserlist(List <User> _NewUserlist) {
		this.MyUserlist = _NewUserlist;
	}

    public User getUserFromList(String _LoginUsername)						// Durchlaufe Liste bis Nickname auf einen User der Liste passt
    {
        for ( User u : MyUserlist )											// User u als Index der For-Schleife
        {
            if( u.getUsername().equals( _LoginUsername) )
            {
            	return u;													//  User gefunden, gibt aktuellen User zurück
            }
        }
		return this.MyUserlist.get(0);										// FEHLER BEHANDELN!!!

    }
    
    private List <User> MyUserlist = new LinkedList <User>();              // Erstelle verkettete Liste von Usern
    
}
