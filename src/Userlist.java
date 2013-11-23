import java.util.LinkedList;											 			// Importiere LinkedList-Funktionen
import java.util.List;

public class Userlist {
	public List <User> getMyUserlist()
	{																				// Getter+Setter für Nutzer-Liste
		return MyUserlist;
	}
	public void setMyUserlist(List <User> _NewUserlist)
	{
		this.MyUserlist = _NewUserlist;
	}

    public boolean compareUserFromList(String _LoginUsername)						// Durchlaufe Liste bis Nickname auf einen User der Liste passt
    {
        boolean a = false;
    	
    	for ( User u : MyUserlist )													// User u als Index der For-Schleife
        {
            if( u.getUsername().equals( _LoginUsername) )
            {
            	return !a;															//  User gefunden, gibt aktuellen User zurück
            }
        }
		return a;																	// FEHLER BEHANDELN bei Typ User

    }
    
    
    public boolean comparePWfromUser (String _LoginUsername, String _LoginPW)		// Durchlaufe Liste bis Nickname auf einen User der Liste passt
    {
        boolean a = false;
    	for ( User u : MyUserlist )													// User u als Index der For-Schleife
        {
            if( u.getUsername().equals( _LoginUsername) )
            {
            	if (u.getPassword().equals(_LoginPW))
            	{
            		return !a;														//  User gefunden, gibt aktuellen User zurück
            	}
            }
        }
		return a;																	// FEHLER BEHANDELN bei Typ User

    }
    
    
    private List <User> MyUserlist = new LinkedList <User>();              			// Erstelle verkettete Liste von Usern
    
}
