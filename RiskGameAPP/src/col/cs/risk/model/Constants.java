package col.cs.risk.model;

/**
 * This class contains the list of Strings with declared values that are used
 * throughout the system.
 * 
 * @author Team25
 *
 */
public class Constants {
	// All the Constants are declared and initialized here
	public static final int NEW_GAME = 1;
	public static final int INITIAL_RE_ENFORCEMENT_PHASE = 2;
	public static final int RE_ENFORCEMENT_PHASE = 3;
	public static final int FORTIFICATION_PHASE = 4;
	public static final int END_PHASE = 5;
	public static final int START_TURN = 6;
	public static final int ACTIVE_TURN = 7;
	public static final int FORTIFYING_PHASE = 8;
	public static final int FORTIFY_PHASE = 9;
	public static final int ATTACK_PHASE = 10;
	public static final int ATTACKING_PHASE = 11;
	public static final int ATTACK_FIGHT_PHASE = 12;
	public static final int CAPTURE = 13;
	public static final int LOST_BATTLE = 14;
	public static final int CARD_TRADE = 15;
	public static final int CHANGE_TURN = 16;
	public static final String ATTACK_DICE_SELECTION = "Attack dice selection";
	public static final String DEFEND_DICE_SELECTION = "Defend dice selection";
	public static final String SHOW_DICE_SELECTION = "Show dice selection";
	public static final String MOVING_ARMIES = "Moving armies";
	public static final String RE_ENFORCEMENT_MESSAGE = "Place an army on a territory you occupy";
	public static final String MOVE_FROM = "Select a country of yours to move armies from";
	public static final String MIN_TWO_ARMY_MESSAGE = "Your occupied country should have minimum 2 army";
	public static final String MOVE_TO = "Select a country of yours to move armies to, which should be an adjusant to ";
	public static final String ARMIES_TO_MOVE = "Enter the no. of armies to move, in text box & press enter";
	public static final String INITIAL_RE_ENFORCEMENT_PHASE_MESSAGE = "Initial Reinforcement phase";
	public static final String START_PHASE_MESSAGE = "Start phase";
	public static final String INITIAL_REINFORCEMENT_PHASE_MESSAGE = "Initial reinforcement phase";
	public static final String ATTACK_PHASE_MESSAGE = "Attack phase";
	public static final String REINFORCEMENT_PHASE_MESSAGE = "Reinforcement phase";
	public static final String FORTIFICATION_PHASE_MESSAGE = "Fortification phase";
	public static final String NEW_GAME_MESSAGE = "New Game";
	public static final String END_PHASE_MESSAGE = "End phase";
	public static final String MIN_ONE_ARMY_MESSAGE = "Minimum one army should be left on a owned territory";
	public static final String VALID_DIGIT_MESSAGE = "Enter a valid digit";
	public static final String GAME_OVER_MESSAGE = "Game over, no winner";
	public static final String WINNER = "A won the game";
	public static final String REINFORCE_MESSAGE = "Reinforce";
	public static final String ATTACK_MESSAGE = "Attack";
	public static final String FORTIFY_MESSAGE = "Fortify";
	public static final String CARD_TRADE_PHASE = "Card Trade phase";
	public static final String SELECT_THE_ACTION_MESSAGE = "Click on the action you want to do";
	public static final String CARD_TRADE_MESSAGE = "Trade a set of cards";
	public static final String NOT_A_CONNECTED_MAP_MESSAGE = "Not a connected map invalid country exists: ";
	public static final String NOT_COMPLETE_CONNECTED_MAP_MESSAGE = "Not a completely connected map";
	public static final String NOT_COMPLETE_CONTINENT_CONNECTED_MAP_MESSAGE = "Not a completely connected continent map";
	public static final String INVALID_MAP_MESSAGE = "Invalid map, check the format";
	public static final String INVALID_PLAYER_NO_SELECTION_MESSAGE = "Invalid number of players selected";
	public static final String ATTACK_COUNTRY_SELECT_MESSAGE = "Select a territory of yours to attack from";
	public static final String DEFEND_COUNTRY_SELECT_MESSAGE = "Select an adjacent territory to defend";
	public static final String CLICK_OK_TO_ROLL_DICE = "Click ok to roll the dice";
	public static final String ATTACK_BW_TERRITORIES_MESSAGE = "Territory A attacking on territory B";
	public static final String CAPTURING_MESSAGE = "Capturing a country ";
	public static final String LOST_BATTLE_MESSAGE = "Lost battle";
	public static final String AUTOMATIC_OR_ALL_OUT_MODE = "Automatic or all out mode during attack";
	public static final String LOST_ARMIES_MESSAGE = "A lost B army/armies";
	public static final String BOTH_LOST_ARMIES_MESSAGE = "Both players lost one army each";
	public static final String CANNOT_ATTACK_MESSAGE = "Can't attack, ";
	public static final String CANNOT_FORTIFY_MESSAGE = "Can't fortify ";
	public static final String OK = "OK";
	public static final String CANCEL = "CANCEL";
	public static final String CARD_INVALID_TRADE_MESSAGE = "Minimum 3 cards required to trade, available no. of cards: ";
	public static final String INVALID_NO_OF_CARDS_TRADE_MESSAGE = "One trade must have 3 cards, 1 each or any 2 plus a wild card";
	public static final int ZERO = 0;
	public static final int ONE = 1;
	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int ELEVEN = 10;
	public static final int TWELVE = 12;
	public static final int FIFTEEN = 15;
	public static final int TWENTY = 20;
	public static final int TWENTY_FIVE = 25;
	public static final int THIRTY = 30;
	public static final int THIRTY_FIVE = 35;
	public static final int FOURTY = 40;
	public static final int FOURTY_FIVE = 45;
	public static final int FIFTY = 50;
	public static final String CHAR_A = "A";
	public static final String DEFAULT_MAP_FILE_NAME = "World.map";
	public static final String DEFAULT_MODIFIED_MAP_FILE_NAME = "currMap.map";
	public static final String DEFAULT_MODIFIED_MAP_IMAGE_FILE_NAME = "currMap.png";
	public static String DEFAULT_SAVED_GAME_FILE_NAME = "savedGame.ser";
	public static String NO_SAVED_GAME_FOUND="No Saved Game Found";
	public static final String ATTACK_IMAGE = "attack.gif";
	public static final String DEFEND_IMAGE = "shield.gif";
	public static final String ARMY_TYPE_INFANTRY = "INFANTRY";
	public static final String ARMY_TYPE_CAVALRY = "CAVALRY";
	public static final String ARMY_TYPE_ARTILLERY = "ARTILLERY";
	public static final String ARMY_TYPE_WILD = "WILD";
	public static final String INFORMATION = "Information";
	public static final String CLIFF="3D Cliff.map";
	public static final String ICELAND = "Iceland.map";
	public static final String INDIA = "India.map";
	public static final String MEXICO = "Mexico.map";
	public static final String TEXAS = "Texas.map";
	public static final String WORLD = "World.map";
	public static final String HUMAN = "Human";
	public static final String AGGRESSIVE = "Aggressive";
	public static final String BENEVOLENT = "Benevolent";
	public static final String RANDOM = "Random";
	public static final String CHEATER = "Cheater";
	public static final String SAVE = "Save";
	
}
