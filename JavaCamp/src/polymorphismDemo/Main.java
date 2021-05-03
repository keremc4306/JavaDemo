package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		/*
		BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), 
				new DatabaseLogger()};
		for(BaseLogger logger : loggers) {
			logger.Log("Log mesajý");
		}
		*/
		
		CustomerManager cManager = new CustomerManager(new DatabaseLogger());
		cManager.add();
		
	}

}
