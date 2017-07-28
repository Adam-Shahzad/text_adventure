import java.util.ArrayList;
import java.util.Scanner;

public class Board {
public static void main(String[] args){
	
	Board b = new Board();
	Player p = new Player(0, 0, null);
	goal g = new goal();
	
	obsticle o1 = new obsticle(1,2);
	obsticle o2 = new obsticle(3,1);
	obsticle o3 = new obsticle(0,-1);
	
	ArrayList<obsticle> oList = new ArrayList();
	
	oList.add(o1);
	oList.add(o2);
	oList.add(o3);
	
	
	b.start();
	
	while(p.check_goal(g, p)== "empty"){
		
		System.out.println("Which Direction do you go?");
		p.move(b.get_move());
		
		b.show_compass( p,  g);
	
		b.goal_status(g, p);
		
		b.hit_status(oList, p);
		
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
	System.out.println("remember you only have 3 lives");
}

public void show_compass(Player p, goal g){
	System.out.println(p.goal_compass(g, p));
}

public void goal_status(goal g, Player p){
	if (p.check_goal(g, p) != "empty"){
		System.out.println(p.check_goal(g, p));
	}
	
}

public void hit_status(ArrayList<obsticle> oList, Player p){
	for(int i =0; i<oList.size(); i++){
		
	String is_hit=p.check_obstacle(oList.get(i), p);
	if (!is_hit.equals("empty")){
		System.out.println(is_hit);
	}
	}
}
}

