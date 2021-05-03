package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		krediUI.calculateCredit(new TeacherCreditManager());
	}

}
