import java.util.Scanner;
public class adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are stranded on a strange road." + 
							"\nIt is night. There are no stars." + 
							"\nDo you:" + 
							"\n1. Go Left" + 
							"\n2. Go Right");
		int direction = kb.nextInt();
		
		if(direction == 1)
		{
			System.out.println("You turn left and begin to follow the road." + 
								"\nIt is dark. You can barely see anything." + 
								"\nThere are sounds coming from the woods on either side of the road." + 
								"\nDo you:" + 
								"\n1. Continue Following the Road" + 
								"\n2. Enter the Woods");
			int location = kb.nextInt();
			
			if(location == 1)
			{
				System.out.println("You continue to follow the road." + 
									"\nThe sounds you heard earlier slowly fade away." + 
									"\nThere is a light in the distance. It's a lamp post." + 
									"\nDo you:" + 
									"\n1. Stand in the Light" + 
									"\n2. Remain in the Shadows");
				int light = kb.nextInt();
				
				if(light == 1)
				{
					System.out.println("You tentatively step into the light." + 
									"\nYou can't see anything beyond the light of the lamp post." + 
									"\nThe light becomes blinding." + 
									"\nYou suddenly find yourself awake in your bed, safe and sound." + 
									"\nYou Win");
				}
				
				else
					System.out.println("You remain in the shadows and avoid the circle of light surrounding the lamp post." + 
									"\nA figure enters the light. It's...you? Or something that looks just like you." + 
									"\nThe light becomes blinding." + 
									"\nThe lamp post goes dark. You are alone." + 
									"\nYou Lose");
			}
			
			else
				System.out.println("You stop following the road and enter the woods." + 
									"\nThe sounds grow louder. Rustling leaves. Cracking branches. Growling." +
									"\nYou walk deeper into the woods. Someone is following you and it's too late to turn back." + 
									"\nDo you:" + 
									"\n1. Run" + 
									"\n2. Turn Around");
				int speed = kb.nextInt();
				
				if(speed == 1)
				{
					System.out.println("You start to run, but it's no use. It catches you. You are torn to shreds." + 
										"\nYou Lose");
				}
				
				else
				{
					System.out.println("You stop walking. It's directly behind you now." + 
										"\nYou turn around to face the creature and are promptly torn to shreds." + 
										"\nYou Lose");
				}
		}
		
		else
		{
			System.out.println("You turn right and begin to follow the road." + 
								"\nIt is dark. You can barely see anything." + 
								"\nYou can hear the sound of footsteps approaching behind you." + 
								"\nDo you:" + 
								"\n1. Keep Walking" + 
								"\n2. Turn Around");
			int location2 = kb.nextInt();
			
			if(location2 == 1)
			{
				System.out.println("You choose to keep walking. The footsteps slowly fade away." + 
									"\nYour foot hits a rock. You listen for the sound of it hitting the ground. Silence." + 
									"\nThere is a hole in the middle of the street." + 
									"\nDo you:" + 
									"\n1. Jump into the Hole" + 
									"\n2. Walk Around the Hole");
				int hole = kb.nextInt();
				
				if(hole == 1)
				{
					System.out.println("You jump into the hole. Big mistake." + 
									"\nIt's a long way down. You hit the ground hard." + 
									"\nYou Lose");
				}
				
				else
				{
					System.out.println("You gingerly start to skirt the edge of the hole." + 
									"\nWhen your back is turned to the woods, a clawed hand reaches out and gives you a shove." + 
									"\nYou Lose");
				}
			}
			
			else
			{
				System.out.println("You stop walking. It's directly behind you now." + 
									"\nYou turn around to face the creature, but nothing is there." + 
									"\nDo you:" + 
									"\n1. Keep Walking" + 
									"\n2. Call Out");
				int yell = kb.nextInt();
				
				if(yell ==1)
				{
					System.out.println("You decide to keep walking. Slowly, all sound fades away. You are swallowed by darkness." + 
										"\nYou Lose");
				}
				
				else
				{
					System.out.println("You call out into the darkness, your voice echoing through the trees. " + 
										"\nNo response. Suddenly, you are knocked to the ground by a heavy force from above." + 
										"\nIt catches you. You are torn to shreds." + 
										"\nYou Lose");
				}
			}
		}
	}
}