
public class BeginnerCalisthenics {
	private String name;
	private double weight;
	private int pushUps;
	private int pullUps;
	private int bSquats;
	
	public Performs excercise;
	
	public BeginnerCalisthenics() {
	}
	
	BeginnerCalisthenics(String name, double weight, int pushUps, int pullUps, int bSquats){
		this.name = name;
		this.weight = weight;
		this.pushUps = pushUps;
		this.pullUps = pullUps;
		this.bSquats = bSquats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPushUps() {
		return pushUps;
	}

	public void setPushUps(int pushUps) {
		this.pushUps = pushUps;
	}

	public int getPullUps() {
		return pullUps;
	}

	public void setPullUps(int pullUps) {
		this.pullUps = pullUps;
	}

	public int getbSquats() {
		return bSquats;
	}

	public void setbSquats(int bSquats) {
		this.bSquats = bSquats;
		
	}
	
	public String tryIt() {
		return excercise.perform();
	}
	public void setExcercise1(Performs newExcercise) {
		excercise = newExcercise;
	}

}

