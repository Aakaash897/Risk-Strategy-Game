package col.cs.risk.model.phase;

import java.util.Observable;

import col.cs.risk.model.Constants;
import col.cs.risk.model.GameModel;
import col.cs.risk.model.PlayerModel;

/**
 * 
 * @author Team
 * Game reinforcement Model
 */
public class ReEnforcementPhaseModel extends Observable implements GamePhase{

	/** current player */
	private PlayerModel currentPlayer;

	/** armies received to distribute */
	private int armiesReceived;

	/** game model */
	private GameModel gameModel;

	/** instance of this class */
	private static ReEnforcementPhaseModel reEnforcementPhaseModel;
	
	private StringBuilder stringBuilder;
	

	/**
	 * 
	 * @return s instance of ReEnforcementPhaseModel
	 */
	public static ReEnforcementPhaseModel getInstance() {
		if(reEnforcementPhaseModel == null) {
			reEnforcementPhaseModel = new ReEnforcementPhaseModel();
		}
		return reEnforcementPhaseModel;
	}

	/**
	 * @return the currentPlayer
	 */
	public PlayerModel getCurrentPlayer() {
		return currentPlayer;
	}

	/**
	 * @param currentPlayer the currentPlayer to set
	 */
	public void setCurrentPlayer(PlayerModel currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	/**
	 * @return the armiesReceived
	 */
	public int getArmiesReceived() {
		return armiesReceived;
	}

	/**
	 * @param armiesReceived the armiesReceived to set
	 */
	public void setArmiesReceived(int armiesReceived) {
		this.armiesReceived = armiesReceived;
	}

	/**
	 * @return the gameModel
	 */
	public GameModel getGameModel() {
		return gameModel;
	}

	@Override
	public void setGameModel(GameModel gameModel) {
		this.gameModel = gameModel;
	}

	@Override
	public void isChanged(boolean isStart) {
		if(isStart) {
			stringBuilder = null;
		}
		setChanged();
		notifyObservers(this);
	}

	@Override
	public String getTitle() {
		return Constants.REINFORCEMENT_PHASE_MESSAGE;
	}
	
	private String basicMessage() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\n*************" + getTitle() + "*************\n\n");
		stringBuilder.append("Current player: ");
		stringBuilder.append(gameModel.getCurrentPlayer().getName());
		stringBuilder.append("\nNo. of armies available with player: ");
		stringBuilder.append(gameModel.getCurrentPlayer().getArmies());
		stringBuilder.append("\n\n");
		stringBuilder.append("Information:\n\n");
		return stringBuilder.toString();
	}

	@Override
	public String getContent() {
		if(stringBuilder == null) {
			stringBuilder = new StringBuilder();
			stringBuilder.append(basicMessage());
		}
		if(gameModel.getSelectedTerritory()!=null) {
			stringBuilder.append("Placed an army on territory: ");
			stringBuilder.append(gameModel.getSelectedTerritory().getName());
			stringBuilder.append("\n\n");
		}
		return stringBuilder.toString();
	}

	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		
	}

}
