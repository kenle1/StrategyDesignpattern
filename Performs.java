
public interface Performs {
	String perform();

}

class muscleUp implements Performs{
	public String perform() {
		return "rep muscle ups, weighted pull ups, and weighted dips!";
	}
}
class tricker implements Performs{
	public String perform() {
		return "back flips, double gainers, frontflip for days!";
	}
}
class powerLift implements Performs{
	public String perform() {
		return "Benches 300, Squats 400, and Deadlifts 600!";
}
}
