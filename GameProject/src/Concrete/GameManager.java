package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.IGame;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements IGame{

	private List<Game> games = new ArrayList<Game>();

	@Override
	public void sell(Game game,Gamer gamer) {
		System.out.println(game.getGameName()+" oyununu satýn aldýnýz : " + gamer.getGamerName());
	}

	
	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " oyunu eklendi");
		
	}

	@Override
	public void update(Game game) {
		Game gameToUpdate = games.stream().filter(g -> g.getGameId() == game.getGameId())
				.findFirst().orElse(null);
		
		if(gameToUpdate == null) {
			System.out.println("Aradýðýnýz oyun bulunamadý");
			return;
		}
		
		gameToUpdate.setGameName(game.getGameName());
		gameToUpdate.setUnitsInStock(game.getUnitsInStock());
		gameToUpdate.setUnitPrice(game.getUnitPrice());
		gameToUpdate.setGameType(game.getGameType());
		
		System.out.println("Oyun bilgileri güncellendi");
	}

	@Override
	public void campaignSale(Game game, Campaign campaign) {
		double unitPriceAfterCampaign = game.getUnitPrice() - ((game.getUnitPrice() * campaign.getDiscount()) / 100) ;
		game.setUnitPrice(unitPriceAfterCampaign);
		
		System.out.println("Kampanyalý satýþ fiyatý : " + unitPriceAfterCampaign);
		
	}

}
