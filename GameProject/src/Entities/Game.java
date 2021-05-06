package Entities;

import Abstract.IEntity;

public class Game implements IEntity {
	
	int gameId;
	String gameName;
	String gameType;
	double unitPrice;
	int unitsInStock;
	
	public Game() {
		
	}
	
	public Game(int gameId, String gameName, String gameType, double unitPrice, int unitsInStock) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gameType = gameType;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	
	
}
