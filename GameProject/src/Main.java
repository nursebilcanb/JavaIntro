import java.util.GregorianCalendar;

import Abstract.ICampaign;
import Abstract.IGame;
import Abstract.IGamer;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		//Satýþlarda kampanya entegrasyonunu refactoring et
		
		Gamer gamer1 = new Gamer(1,"nursebilcanb","Nursebil","Canbolat","10000000000","nursebil@gmail.com","nur123",new GregorianCalendar(2001,6,5).getTime());

		IGamer gamer = new GamerManager(new MernisServiceAdapter());
		gamer.register(gamer1);
		gamer.login(gamer1);
		
		
		Campaign campaign1 = new Campaign(1,"Anneler Günü Ýndirimi",10);
		
		ICampaign campaign = new CampaignManager();
		campaign.add(campaign1);
		
		Game game1 = new Game(1,"Mobile Legends","War",80,15);
		
		IGame game = new GameManager();
		game.add(game1);
		game.campaignSale(game1, campaign1);
		game.sell(game1, gamer1);
	}

}
