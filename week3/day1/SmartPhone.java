package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp() {
		System.out.println("WhatsApp");
	}
	
	public void takeVideo() {
		System.out.println("Take Video from SmartPhone");
	}

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.connectWhatsApp();
		sp.takeVideo();
		sp.makeCall();
		sp.sendMsg();
		sp.saveContact();
	}

}
