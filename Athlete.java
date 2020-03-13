
public class Athlete {
	public static void main (String args[]) {
		BeginnerCalisthenics Bob = new BeginnerCalisthenics(null, 170, 7, 5, 10);
		System.out.println("BeginnerCalisthenics: ");
		System.out.println("Bob's Stats: " +Bob.getWeight() +" lbs, " +Bob.getPushUps()+" push ups, " +Bob.getPullUps() + " pullUps, " +Bob.getbSquats() + " body weight squats");
		System.out.println();
		
		advanceCalisthenics Ken = new advanceCalisthenics(null, 130, 30, 30, 30, 30, 30);
		System.out.println("Ken can perform :" +Ken.getPushUps() + "push ups, "+Ken.getPullUps() + "pull ups, " +Ken.getPlancheTime() +" second planche, " +Ken.getFrontLeverTime() +"second font lever");
		System.out.println("Ken is an advanceCalisthenics athlete and can " + Ken.tryIt());
		System.out.println();
		
		TrickAthlete David = new TrickAthlete(null, 15, 8, 15, 15, 4);
		System.out.println("David's stats: " +David.getPullUps() +" pull ups, " +David.getPushUps() + " push ups, " +David.getbSquats() +" bodyweight squats, " +David.getExperience() +"tricker ");
		System.out.println("David is a Trick athlete and does " +David.tryIt());
		System.out.println();
		
		weightLifter Derrick = new weightLifter(null, 10, 15, 15, 15);
		System.out.println("Derrick's stats: " +Derrick.getPullUps() +" pull ups, " +Derrick.getPushUps() + " push ups, " +Derrick.getbSquats() +" bodyweight squats ");
		System.out.println("Derrick " +Derrick.tryIt());

	
	}

}
