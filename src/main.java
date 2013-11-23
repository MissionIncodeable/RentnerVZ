import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Userlist VZUserlist 			= new Userlist();
		AccountController VZAccContr	= new AccountController(VZUserlist);
		InterfaceController VZIntCon 	= new InterfaceController(VZAccContr);
		VZRoutine FirstRoutine 			= new VZRoutine(VZIntCon);
		FirstRoutine.runVZ();
	}

}
