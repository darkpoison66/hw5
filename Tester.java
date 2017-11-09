import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Piece a = new Pawn(Color.WHITE);
        Piece b = new Pawn(Color.BLACK);

        Square blackF = new Square("a7");
        Square blackT = new Square("a6");

        Square whiteF = new Square("a1");
        Square whiteT = new Square("a2");

        Optional<String> com = Optional.of("purple");
        Optional<String> comp = Optional.empty();

        Ply second = new Ply(a, blackF, blackT, com);
        Ply first = new Ply(b, whiteF, whiteT, com);
        Ply third = new Ply(a, new Square("a2"), new Square("a3"), com);
        Ply fourth = new Ply(b, new Square("a6"), new Square("a5"), com);

        Move numbaOne = new Move(first, second);
        Move numbaTwo = new Move(third, fourth);

        List<Move> list = new ArrayList<>();
        list.add(numbaOne);
        list.add(numbaTwo);

        ChessGame chess = new ChessGame(list);

        List<Move> noComments = new ArrayList<>();
        noComments = chess.getMovesWithoutComment();
        System.out.println(noComments);




    }
}