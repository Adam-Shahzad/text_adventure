
import java.util.Random;

public class obsticle extends Place {
	int x_value;
	int y_value;
	int damage;
	String outcome;

	public obsticle(int x_value, int y_value, String outcome, int damage) {
		super();
		this.x_value = x_value;
		this.y_value = y_value;
		this.outcome = outcome;
		this.damage = damage;
	}

	public String return_text(Player p) {
		if (outcome.endsWith("lost")) {
			
			p.setX_Co_orrdinates(Random_num.rn.nextInt(4 - 0 + 1) + 0);
			p.setY_Co_orrdinates(Random_num.rn.nextInt(4 - 0 + 1) + 0);
		}
		if (outcome.endsWith("start")) {
			Random rn = new Random();
			p.setX_Co_orrdinates(0);
			p.setY_Co_orrdinates(0);
		}
		if (outcome.endsWith("tunnel")) {
			System.out.println(
					"You see an mountain, inside is a dark cave, you have a torch so your good, plus you tie a string to the front so you don't get lost in the tunnel");
			System.out.println("do you go throuth the tunnel y/n?");
			if (InputClass.sc.nextLine().equals("y")) {
				System.out.println("The cave entrerance collapses behind you");
				while (p.getHit_points() > 0) {
					InputClass.sc.nextLine();
					System.out.print("you look around");
					InputClass.sc.nextLine();
					System.out.print("Nothing is around, you dig as much as you can");
					InputClass.sc.nextLine();
					System.out.print("you slowly starve, lose a life");
					p.setHit_points(p.getHit_points() - 1);
					InputClass.sc.nextLine();
					System.out.print("you make your way throught the 5 stages of dealing with your mortality");
					InputClass.sc.nextLine();
					System.out.print("you get stuck on anger");
					InputClass.sc.nextLine();
					System.out.print("you realise nothing you do matters and go to sleep");
					InputClass.sc.nextLine();
					System.out.print("you wake up");
				}
			}
		}
		return outcome + "\nYou have " + p.getHit_points() + " lives left";
	}

}
