import java.util.ArrayList;
import java.util.Scanner;

public class Board {
	public static void main(String[] args) {

		Board b = new Board();
		Player p = new Player(0, 0, null);
		goal g = new goal();
		ArrayList<obsticle> oList = new ArrayList();

		b.init(oList);
		b.start();

		while (p.check_goal(g, p) == "empty" && p.check_hit_points(p)) {

			System.out.println("Which Direction do you go?");
			p.move(b.get_move());
			System.out.println(p.getX_Co_orrdinates()+ "," +p.getY_Co_orrdinates());
			b.show_compass(p, g);

			b.goal_status(g, p);

			b.hit_status(oList, p);

		}

		System.out.print("Congrats");
		b.printDeath(p);
	}

	public String get_move() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public void start() {

		System.out.println("You Are in an infinite forest look for the goal and avoid the obstacles");
		System.out.println("You can go type n,s,w,e to move or look to you know...look around");
		System.out.println("remember you only have 3 lives");
	}

	public void show_compass(Player p, goal g) {
		System.out.println(p.goal_compass(g, p));
	}

	public void goal_status(goal g, Player p) {
		if (p.check_goal(g, p) != "empty") {
			System.out.println(p.check_goal(g, p));
		}

	}

	public void hit_status(ArrayList<obsticle> oList, Player p) {
		for (int i = 0; i < oList.size(); i++) {

			String is_hit = p.check_obstacle(oList.get(i), p);
			if (!is_hit.equals("empty")) {
				System.out.println(is_hit);
			}
		}
	}

	public void init(ArrayList<obsticle> oList) {

		obsticle o1 = new obsticle(1, 2, "You Stubbed Your toe... like really hard. Cursing in anger you loose you balance and trip");
		obsticle o2 = new obsticle(3, 1, "You suddenly realise you are all alone and will probably die. you break down crying");
		obsticle o3 = new obsticle(0, -1, "A bear stares right at you, it decide it wants nothing to do with you and leaves, you follow it, you are now lost");

		oList.add(o1);
		oList.add(o2);
		oList.add(o3);

	}

	public void printDeath(Player p){
		if (p.check_hit_points(p)) {System.out.print("... you died");}
	}
}
