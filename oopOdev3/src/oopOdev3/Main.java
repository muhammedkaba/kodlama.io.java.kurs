package oopOdev3;

import oopOdev3.Concrete.GameManager;
import oopOdev3.Concrete.PlayerManager;
import oopOdev3.Entities.Campaign;
import oopOdev3.Entities.Game;
import oopOdev3.Entities.Player;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign(1,"Efsane Cuma");
		Game game = new Game(1, "Flappy Bird");
		Player player = new Player(1, "1525", "Engin", "Demiro�", 1986);
		GameManager gameManager = new GameManager(campaign);
		PlayerManager playerManager = new PlayerManager();
		playerManager.register(player);
		gameManager.buy(game, player);

	}

}
