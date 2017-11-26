/**
 * My name is Byung Gil and all of this work is my own.
 */
import java.util.*;
public class PlayerNFLmanage {
	final private static ArrayList<PlayerNFL> LIST_OF_PLAYERS = new ArrayList<PlayerNFL>();
	public PlayerNFLmanage() {
		createPlayers();
	}
	public static void createPlayers() {

		PlayerNFL mcafee = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/MCA385008.png","Pat McAfee", 30, 73, 233, 118.8, 0, 1, 1, 0, 35, 0, 0, 0, 1);

		PlayerNFL luck = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/LUC524055.png","Andrew Luck", 27, 76, 240, 96.4, 31, 545, 64, 2, 4240, 341, 6, 5, 346);

		PlayerNFL cook = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/COO045872.png","Connor Cook", 24, 76, 217, 83.4, 1, 21, 0, 0, 150, 0, 2, 1, 14);

		PlayerNFL williams = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/WIL384555.png","Jonathan Williams", 23, 72, 223, 39.6, 0, 1, 27, 1, 0, 94, 2, 2, 0);

		PlayerNFL landry = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/LAN163029.png","Jarvis Landry", 24, 71, 206, 39.6, 0, 1, 5, 0, 0, 17, 2, 2, 0);

		PlayerNFL bell = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/BEL474300.png","Le'Veon Bell", 25, 73, 225, 39.6, 0, 1, 261, 7, 0, 1268, 4, 1, 0);

		PlayerNFL mallett = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/MAL262949.png","Ryan Mallett", 29, 78, 250, 22.2, 0, 6, 5, 0, 26, -6, 0, 0, 3);

		PlayerNFL whitehurst = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/WHI646241.png","Charlie Whitehurst", 34, 77, 226, 78.8, 1, 24, 2, 0, 182, 1, 0, 0, 14);

		PlayerNFL savage = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/SAV166116.png","Tom Savage", 27, 76, 230, 80.9, 0, 73, 6, 0, 461, 12, 1, 1, 46);

		PlayerNFL mccown = new OffensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/MCC600777.png","Josh McCown", 38, 76, 218, 72.3, 6, 165, 7, 0, 1100, 21, 7, 4, 90);



		PlayerNFL cyprien = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/CYP563610.png", "Johnathan Cyprien", 26, 72, 223, 0, 0, 1.0, 0, 1, 0, 0, 96, 31, 127);

		PlayerNFL coleman = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/COL295827.png", "Kurt Coleman", 29, 71, 208, 1, 0, 1.0, 57, 1, 4, 11, 66, 29, 95);

		PlayerNFL burnett = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/BUR426788.png", "Morgan Burnett", 28, 73, 209, 0, 0, 3.0, 19, 0, 2, 11, 70, 23, 93);

		PlayerNFL ryan = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/RYA237161.png", "Logan Ryan", 26, 71, 195, 0, 0, 1.0, 46, 1, 2, 13, 74, 18, 92);

		PlayerNFL ward = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/WAR274773.png", "T.J. Ward", 30, 70, 200, 0, 0, 1.0, 23, 3, 1, 8, 69, 18, 87);

		PlayerNFL conte = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/CON690403.png", "Chris Conte", 28, 74, 203, 1, 0, 0.0, 73, 0, 2, 7, 59, 10, 69);

		PlayerNFL stewart = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/STE755545.png", "Darian Stewart", 28, 71, 214, 0, 0, 0.0, 36, 1, 3, 6, 55, 13, 68);

		PlayerNFL vaccaro = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/VAC079101.png", "Kenny Vaccaro", 26, 72, 214, 0, 0, 1.0, 30, 2, 2, 5, 51, 17, 68);

		PlayerNFL quin = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/QUI360604.png", "Glover Quin", 31, 72, 207, 0, 0, 0.0, 0, 1, 2, 5, 55, 13, 68);

		PlayerNFL ogletree = new DefensivePlayer("http://static.nfl.com/static/content/public/static/img/fantasy/transparent/200x200/OGL654714.png", "Alec Ogletree", 25, 74, 235, 0, 0, 0.0, 15, 1, 2, 13, 98, 38, 136);

		
		LIST_OF_PLAYERS.add(mcafee);

		LIST_OF_PLAYERS.add(luck);

		LIST_OF_PLAYERS.add(cook);

		LIST_OF_PLAYERS.add(williams);

		LIST_OF_PLAYERS.add(landry);

		LIST_OF_PLAYERS.add(bell);

		LIST_OF_PLAYERS.add(mallett);

		LIST_OF_PLAYERS.add(whitehurst);

		LIST_OF_PLAYERS.add(savage);

		LIST_OF_PLAYERS.add(mccown);

		LIST_OF_PLAYERS.add(cyprien);

		LIST_OF_PLAYERS.add(coleman);

		LIST_OF_PLAYERS.add(burnett);

		LIST_OF_PLAYERS.add(ryan);

		LIST_OF_PLAYERS.add(ward);

		LIST_OF_PLAYERS.add(conte);

		LIST_OF_PLAYERS.add(stewart);

		LIST_OF_PLAYERS.add(vaccaro);

		LIST_OF_PLAYERS.add(quin);

		LIST_OF_PLAYERS.add(ogletree);

	}

	public String toString() {

		String list = "";

		for (PlayerNFL n : LIST_OF_PLAYERS)

			list += (n.name + " " + LIST_OF_PLAYERS.indexOf(n) + "\n");

		return list;

	}

}