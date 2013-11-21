import java.util.Scanner;

public class Management {
	Scanner Input = new Scanner (System.in);											// Lege Scanner-Objekt an
	
	public Management (Registry _ManageReg){											// Management-Konstruktor
		this.RegistryOfManagement = _ManageReg;
	}
	
	
	public void Register (){															// Case 3 - Nutzerregistrierung-Funktion
		System.out.println("Oooook����y! \n"
				+ "Sie haben sich also endlich dazu entschieden,"
				+ "in unser Werk hineinzuschnuppern? \n");
		Input.nextLine();
		System.out.println ("Nichts leichter als Das! \n"
				+ "Geben Sie einfach Ihre Daten wie unten gefragt wird an: \n");		// Datenabfrage
		System.out.println ("Wie lautet Ihr Vorname? (Und bitte nicht l�gen ;) ");
		String FirstName = Input.next();
		System.out.println ("Wie lautet Ihr Nachname?");
		String LastName = Input.next();
		System.out.println ("Nun das Pseudonym, unter dem man Sie finden soll?");
		String Username = Input.next();
		System.out.println ("Ihre Email-Adresse?");
		String Email = Input.next();
		System.out.println ("Und zu guter Letzt ihr Passwort! \n"
				+ "Passen Sie aber auf, dass Sie es nicht verlieren - sonst hat das b�se Folgen!");
		String Password = Input.next();
		this.RegistryOfManagement.RegNewUser(FirstName, LastName, Username, Email, Password);					// Registriere neuen User
		System.out.println ("Alles klar! Sie sind jetzt offiziell Mitglied bei RentnerVZ. \n"
				+ "�brigens, ich bin ab jetzt ihr Butler Simon und werde Sie w�hrend der Reise"
				+ "in die virtuelle Welt von RentnerVZ begleiten. \n"
				+ "Lassen wir zur Feier des Tages ein Feuerwerk steigen....: \n"
				+ "KABOOOOM!!!"
				+ "(Dr�cken Sie eine biebige Taste um ins Hauptmen� zur�ckzugelangen.)");
		Input.next();
		this.Greeting();
	}
	
	public void Greeting (){											// Begr��ung ung Men�auswahl
		this.ClearScreen();
		System.out.println (
				"Willkommen zur�ck zum Hauptmen�! \n"
				+ "Ich hoffe, Sie sind noch zufrieden mit meiner Leistung - ich bem�he mich stets mein Bestes zu tun. "
				+ "W�hlen Sie zwischen folgenden Optionen: \n"
				+ "1)	Anmeldung im System \n"
				+ "2)	Bei RentnerVZ registrieren! \n"
				+ "3)	Wer ist alles im RentnerVZ? \n"
				+ "4)	Meine Beine tun weh -.- \n");
		int IntOfChoice = Input.nextInt();
		switch (IntOfChoice){
			case 1:	
					break;
			case 2:	
					this.Register();
					break;
			case 3:	
					break;
			case 4:															// Case 4 - Beende Programm
					System.exit(0); 
					break;
			default:
					Greeting();
					break;
		}
	}
	
	
	public void ClearScreen (){
		for (int i=0; i <=25; i++){
			System.out.println();
		}
	}
	
	public void RunVZ (){		
		System.out.println ("Willkommen im Rentner VZ. \n"
				+ "Dies ist das erste soziale Netzwerk, welches speziell f�r Menschen h�heren Alters entworfen wurde. \n"
				+ "Dementsprechend ist unser System aufgebaut, sodass Sie sich im Nu zurecht finden werden. \n"
				+ "Scheuen Sie sich nicht, neue Funktionen auszuprobieren und freuen Sie sich jeden Tag neu, \n"
				+ "in diese virtuelle Parallelwelt einzutauchen Blablabla.\n" );
		Input.nextLine();
		this.Greeting();
		
	}
	private Registry RegistryOfManagement;
}
