
public class main {

	public static void main(String[] args) {
		Userlist VZUserlist = new Userlist();
		Registry ManageReg = new Registry(VZUserlist);
		Management FirstManagement = new Management(ManageReg);
		FirstManagement.RunVZ();
	}

}
