package test.col.cs.risk.model;

import static org.junit.Assert.assertEquals;

import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import col.cs.risk.model.ContinentModel;
import col.cs.risk.model.GameModel;
import col.cs.risk.model.PlayerModel;
import col.cs.risk.model.TerritoryModel;

public class PlayerModelTest {
	
	PlayerModel playerModel;
	GameModel gameModel;
	
	@Before
	public void before() {
		playerModel = new PlayerModel(101, "player1");
		gameModel = new GameModel();
	}
	
	@After
	public void after() {
		playerModel = null;
		gameModel = null;
	}
	
	/**
	 * Test case for calculating territory bonus
	 */
	@Test
	public void testTerritoryBonus() {

		TerritoryModel tmodel1 = new TerritoryModel(201, "tname1", 10, 20, new ContinentModel(301, "cname1", 3));
		TerritoryModel tmodel2 = new TerritoryModel(202, "tname2", 30, 40, new ContinentModel(302, "cname2", 5));
		TerritoryModel tmodel3 = new TerritoryModel(203, "tname3", 30, 40, new ContinentModel(301, "cname1", 3));
		TerritoryModel tmodel4 = new TerritoryModel(204, "tname4", 30, 40, new ContinentModel(302, "cname2", 5));
		TerritoryModel tmodel5 = new TerritoryModel(205, "tname5", 30, 40, new ContinentModel(301, "cname1", 3));
		TerritoryModel tmodel6 = new TerritoryModel(206, "tname6", 30, 40, new ContinentModel(302, "cname2", 5));
		TerritoryModel tmodel7 = new TerritoryModel(201, "tname7", 10, 20, new ContinentModel(301, "cname1", 3));
		TerritoryModel tmodel8 = new TerritoryModel(202, "tname8", 30, 40, new ContinentModel(302, "cname2", 5));
		TerritoryModel tmodel9 = new TerritoryModel(203, "tname9", 30, 40, new ContinentModel(301, "cname1", 3));
		TerritoryModel tmodel10 = new TerritoryModel(204, "tname10", 30, 40, new ContinentModel(302, "cname2", 5));
		TerritoryModel tmodel11 = new TerritoryModel(205, "tname11", 30, 40, new ContinentModel(301, "cname1", 3));
		TerritoryModel tmodel12 = new TerritoryModel(206, "tname12", 30, 40, new ContinentModel(302, "cname2", 5));
		Vector<TerritoryModel> territories = new Vector<>();
		territories.add(tmodel1);
		territories.add(tmodel2);
		territories.add(tmodel3);
		territories.add(tmodel4);
		territories.add(tmodel5);
		territories.add(tmodel6);
		territories.add(tmodel7);
		territories.add(tmodel8);
		territories.add(tmodel9);
		territories.add(tmodel10);
		territories.add(tmodel11);
		territories.add(tmodel12);
		gameModel.setCurrentPlayer(playerModel);
		playerModel.setOccupiedTerritories(territories);

		assertEquals(4, playerModel.territoryBonus());

		territories.remove(0);
		territories.remove(0);
		territories.remove(0);
		assertEquals(3, playerModel.territoryBonus());

		territories.remove(0);
		assertEquals(3, playerModel.territoryBonus());
	}
	
	/**
	 * Calculating turn bonus for a current player
	 */
	@Test
	public void testTurnBonus() {
		PlayerModel playerModel = new PlayerModel(1, "P1");

		ContinentModel continent = new ContinentModel(1, "C1", 2);
		Vector<ContinentModel> continents = new Vector<>();
		continents.add(continent);

		TerritoryModel model1 = new TerritoryModel(1, "T1", 10, 10, continent);
		TerritoryModel model2 = new TerritoryModel(2, "T2", 10, 20, continent);
		TerritoryModel model3 = new TerritoryModel(3, "T3", 20, 10, continent);
		TerritoryModel model4 = new TerritoryModel(4, "T4", 20, 20, continent);

		Vector<TerritoryModel> territories = new Vector<>();
		territories.add(model1);
		territories.add(model2);
		territories.add(model3);
		territories.add(model4);

		model1.setPlayerModel(playerModel);
		model2.setPlayerModel(playerModel);
		model3.setPlayerModel(playerModel);
		model4.setPlayerModel(playerModel);

		continent.setTerritories(territories);
		playerModel.setOccupiedTerritories(territories);
		gameModel.setTerritories(territories);
		gameModel.setCurrentPlayer(playerModel);
		gameModel.setContinents(continents);

		playerModel.addTurnBonus(gameModel);

		// 2+3 (2- continent bonus and 3 territory bonus)
		assertEquals(5, playerModel.getArmies());

		playerModel.setArmies(0);
		PlayerModel playerModel1 = new PlayerModel(2, "P2");
		model4.setPlayerModel(playerModel1);

		playerModel.addTurnBonus(gameModel);

		// 3 (0- continent bonus and 3 territory bonus)
		assertEquals(3, playerModel.getArmies());

	}

}