
/**
 * enum that describes the color of the code pegs
 * code pegs are used to make the code
 * @author revouyt
 *
 */
public enum ColorCodePegs {
WHITE,
BLUE,
RED,
PURPLE,
ORANGE,
YELLOW;

public static ColorCodePegs getRandom() {
    return values()[(int) (Math.random() * values().length)];
}
}
