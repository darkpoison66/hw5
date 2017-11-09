import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Represnts a squence of Moves in a game of chess
 * @version 1.0
 * @author mabdi3
 */
public class ChessGame {
    private List<Move> moves;

    /**
     * Creates an instance of a ChessGame with all
     * the required parameters.
     *
     * @param moves List of moves
     */
    public ChessGame(List<Move> moves) {
        this.moves = moves;
    }

    /**
     * @return the List of moves
     */
    public List<Move> getMoves() {
        return moves;
    }

    /**
     * @return the nth move
     * @param n the nth move
     */
    public Move getMove(int n) {
        return moves.get(n - 1);
    }

    /**
     * @return a list filtered  by the Predicate filter
     * @param filter filter for which the list should be ordered
     */
    public List<Move> filter(Predicate<Move> filter) {
        return new ArrayList<Move>();
    }

    /**
     * @return a list of moves without comments
     */
    public List<Move> getMovesWithoutComment() {
        return new ArrayList<Move>();
    }

    /**
     * @return a list of moves with comments
     */
    public List<Move> getMovesWithComment() {
        return new ArrayList<Move>();
    }

    /**
     * @return a list of moves with a piece of this type
     * @param p the piece to match moves with
     */
    public List<Move> getMovesWithPiece(Piece p) {
        return new ArrayList<Move>();
    }


}