
public class TrickAthlete extends BeginnerCalisthenics {
	private int yearExperience;
	
	public TrickAthlete(String name, double weight, int pushUps, int pullUps, int bSquats, int yearExperience) {
		super(name, weight, pushUps, pullUps, bSquats);
		this.yearExperience = yearExperience;
		
		excercise = new tricker();
	}

	public int getYearExperience() {
		return yearExperience;
	}

	public void setYearExperience(int yearExperience) {
		this.yearExperience = yearExperience;
	}
	
	public String getExperience() {
		if(this.yearExperience < 1)
			return "beginner";
		
	else if(this.yearExperience > 1 && this.yearExperience <=2 ) {		
			return "novice";
	}
	else if(this.yearExperience > 2 && this.yearExperience <= 5) {
		return "intermediate";
	}
	else {
		return "Experienced tricker";
}

	 
}}


