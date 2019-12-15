import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.Scanner;
public class Main {
	static ArrayList<TennisPlayers> players = new ArrayList<TennisPlayers>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		boolean loop = true;
		PlayersList obj = new PlayersList();
	do {
		System.out.println("Enter a command: \n(1) Add a player \n(2) Remove a player \n(3) View players \n(4) Find someone to play with \n(5) Change Information");
		int menu = input.nextInt();
		
		if(menu == 1) {
			TennisPlayers player = new TennisPlayers();
			System.out.println("Enter a name: ");
			String name = input3.nextLine();
			System.out.println("Enter a state: ");
			String state = input3.nextLine();
			System.out.println("Enter an age: ");
			int age = input.nextInt();
			System.out.println("Enter a skill level(1.0 - 5.0): ");
			double level = input.nextDouble();
			player.setName(name);
			player.setAge(age);
			player.setSkillLevel(level);
			player.setState(state);
			players = obj.addToList(player);
			
					}
		
		if(menu == 2) {
			
			System.out.println("Enter the name of the player: ");
			String name = input.next();
			players = obj.removeFromList(findPlayer(name));
			
			
		}
		
		if(menu == 3) {
			for(TennisPlayers player : players) {
				System.out.printf("%25s%15s%4d%4f%100f",player.getName(),player.getState(),player.getAge(),player.getSkillLevel(),player.getPercentage());
				System.out.println();
				

			}
			System.out.println();
		}
		
		if(menu == 4) {
			System.out.println("Would you like to search based on location (1), skill level (2), age(3), or winning percentage(4)? ");
			int choice = input2.nextInt();
			if(choice == 1) {
				System.out.println("Enter your location: ");
				String location = input3.nextLine();
				for(TennisPlayers player : players) {
					if(player.getState().equals(location)) {
						System.out.format("%25s%15s%4d%10f%10f",player.getName(),player.getState(),player.getAge(),player.getSkillLevel(),player.getPercentage());
					}
					System.out.println();
				}
				System.out.println();
			}
			if(choice == 2) {
				System.out.println("Enter your skill level: ");
				double skill = input3.nextDouble();
				for(TennisPlayers player : players) {
					if(player.getSkillLevel() == skill) {
						System.out.format("%25s%15s%4d%10f%10f",player.getName(),player.getState(),player.getAge(),player.getSkillLevel(),player.getPercentage());
					}
					System.out.println();
				}
				System.out.println();
			}
			if(choice == 3) {
				System.out.println("Enter your age: ");
				int age = input3.nextInt();
				for(TennisPlayers player : players) {
					if(player.getAge() == age) {
						System.out.format("%25s%15s%4d%10f%10f",player.getName(),player.getState(),player.getAge(),player.getSkillLevel(),player.getPercentage());
					}
					System.out.println();
				}
				System.out.println();
			}
			if(choice == 4) {
				System.out.println("Enter a minimum winning percentage: ");
				double percentage = input3.nextDouble();
				for(TennisPlayers player : players) {
					if(player.getPercentage() >= percentage) {
						System.out.format("%25s%15s%4d%10f%10f",player.getName(),player.getState(),player.getAge(),player.getSkillLevel(),player.getPercentage());
					}
					System.out.println();
				}
				System.out.println();
			}
			}
		
		
		if(menu == 5) {
			System.out.println("Enter the name of the player: ");
			String name = input3.nextLine();
			System.out.println("What would you like to change? (1) name (2) state (3) age (4) skill level");
			int choice = input.nextInt();
			if(choice == 1) {
				System.out.println("Enter a new name: ");
				String name2 = input3.nextLine();
				(findPlayer(name)).setName(name2);
			}
			if(choice == 2) {
				System.out.println("Enter a new state: ");
				String state = input2.nextLine();
				(findPlayer(name)).setState(state);
			}
			if(choice == 3) {
				System.out.println("Enter a new age: ");
				int age = input.nextInt();
				(findPlayer(name)).setAge(age);
			}
			if(choice == 4) {
				System.out.println("Enter a new skill level: ");
				double level = input.nextDouble();
				(findPlayer(name)).setSkillLevel(level);
			}
			
			
			
		}
		
	}while(loop);
		
	}
	
	public static TennisPlayers findPlayer(String name) {
		
		for(TennisPlayers player : players) {
			if((player.getName()).equals(name)) {
				return player;
			}
		}
		return null;	
	}
	

}
