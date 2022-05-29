package week3.day2;

public interface SmartWatch extends Watch{
	
	
	public boolean connectToPhone();
	
	public boolean turnBlueTooth();
	
	public int getStepCount();
	
	public int getHeartBeat();
	
	public void setGoal(int steps);

}
