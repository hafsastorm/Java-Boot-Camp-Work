package RacingGame;

public interface PlayerI {
	
	//private Static String name;
	
	
	public String getName();
	public int getCash();
	public int addCash(int cash);
	public void setVehicle(Car vehicle);
	public Car getVehicle();
	
	
	
}