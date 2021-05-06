package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface IGame {
	void add(Game game);
	void sell(Game game,Gamer gamer);
	void update(Game game);
	void campaignSale(Game game,Campaign campaign);

}
