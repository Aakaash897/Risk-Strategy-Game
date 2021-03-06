package col.cs.risk.model.phase;

import java.io.Serializable;
import java.util.Observable;

import col.cs.risk.model.Constants;
import col.cs.risk.model.GameModel;

/**
 * This class handles the entities for the start phase for showing the info
 * according the actions done by the player in the start phase.
 * 
 * @author Team25
 *
 */
public class StartPhaseModel extends Observable implements GamePhase, Serializable {

	/** Serial Version UID */
	private static final long serialVersionUID = 7804832568833730674L;

	/** Game model */
	private GameModel gameModel;

	/** StringBuilder object */
	private StringBuilder stringBuilder;

	/** instance of this class */
	private static StartPhaseModel startPhaseModel;

	/**
	 * this method returns the instance of this class. if the instance of the class
	 * is not created it creates and returns it otherwise returns it.
	 * 
	 * @return instance of StartPhaseModel
	 */
	public static StartPhaseModel getInstance() {
		if (startPhaseModel == null) {
			startPhaseModel = new StartPhaseModel();
		}
		return startPhaseModel;
	}

	/**
	 * Checks whether the instance variable initialized
	 * 
	 * @returns true if initialized
	 */
	public static boolean isInitialized() {
		return startPhaseModel != null ? true : false;
	}

	/**
	 * De-initializes the instance variable
	 */
	public static void clear() {
		startPhaseModel = null;
	}

	/**
	 * @return the gameModel
	 */
	public GameModel getGameModel() {
		return gameModel;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setGameModel(GameModel gameModel) {
		this.gameModel = gameModel;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void isChanged(boolean isStart) {
		if (isStart) {
			stringBuilder = null;
		}
		setChanged();
		notifyObservers(this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getTitle() {
		return Constants.START_PHASE_MESSAGE + " / " + Constants.INITIAL_RE_ENFORCEMENT_PHASE_MESSAGE;
	}

	/**
	 * Returns the info about player
	 * 
	 * @return simple info on start
	 */
	private String basicMessage() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\n************* " + getTitle() + " *************\n\n");
		stringBuilder.append("Information:\n\n");
		stringBuilder.append(basicMessage1());
		return stringBuilder.toString();
	}

	/**
	 * Returns the basic player info
	 * 
	 * @return basic player info string according to the phase
	 */
	private String basicMessage1() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Current player: ");
		stringBuilder.append(gameModel.getCurrentPlayer().getName());
		stringBuilder.append(" - ");
		stringBuilder.append(gameModel.getCurrentPlayer().getStrategy().getStrategyString());
		stringBuilder.append("\nNo. of armies available with player: ");
		stringBuilder.append(gameModel.getCurrentPlayer().getArmies());
		stringBuilder.append("\n\n");
		return stringBuilder.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getContent() {
		if (stringBuilder == null) {
			stringBuilder = new StringBuilder();
			stringBuilder.append(basicMessage());
		} else {
			if (gameModel.getSelectedTerritory() != null) {
				stringBuilder.append("Placed an army on territory: ");
				stringBuilder.append(gameModel.getSelectedTerritory().getName());
				stringBuilder.append("\n-----------------------\n\n");
			}
			stringBuilder.append(basicMessage1());
		}
		String content = stringBuilder.toString();
		return content;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return stringBuilder.toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
	}

}
