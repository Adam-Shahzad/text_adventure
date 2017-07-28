import java.util.Scanner;

public class Board {
public static void main(String[] args){
	Board b = new Board();
	Player p = new Player(0, 0, null);
	goal g = new goal();
	obsticle o = new obsticle();
	
	b.start();
	
	while(p.check_goal(g, p)== "empty"){
		
		System.out.println("Which Direction do you go?");
		p.move(b.get_move());
		
		b.show_compass( p,  g);
	
		b.goal_status(g, p);
		
		b.hit_status(o, p);
		
	}
	
	System.out.print("Congrats");
	}
	


public String get_move()
{
	Scanner sc = new Scanner(System.in);
	return sc.nextLine();
}

public void start()
{
	
	System.out.println("You Are in an infinite forest look for the goal and avoid the obstacles");
}

public void show_compass(Player p, goal g){
	System.out.println(p.goal_compass(g, p));
}

public void goal_status(goal g, Player p){
	if (p.check_goal(g, p) != "empty"){
		System.out.println(p.check_goal(g, p));
	}
	
}

public void hit_status(obsticle o, Player p){
	
	String is_hit=p.check_obstacle(o, p);
	if (!is_hit.equals("empty")){
		System.out.println(is_hit);
	}
}
}

