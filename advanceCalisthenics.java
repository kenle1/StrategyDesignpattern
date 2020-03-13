
public class advanceCalisthenics extends BeginnerCalisthenics{
	private double plancheTime;
	private double frontLeverTime;

	public advanceCalisthenics(String name, double weight, int pushUps, int pullUps, int bSquats, double plancheTime, double frontLeverTime) {
		super(name, weight, pushUps, pullUps, bSquats);
		this.plancheTime = plancheTime;
		this.frontLeverTime = frontLeverTime;
		
		excercise = new muscleUp();
		
	}
	
	public double getPlancheTime() {
		return plancheTime;
	}

	public void setPlancheTime(double plancheTime) {
		this.plancheTime = plancheTime;
	}

	public double getFrontLeverTime() {
		return frontLeverTime;
	}

	public void setFrontLeverTime(double frontLeverTime) {
		this.frontLeverTime = frontLeverTime;
	}

}
