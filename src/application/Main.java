package application;

import boardgame.Position;
import chess.ChessMatch;

public class Main {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        UI.printboard(chessMatch.getPieces());

    }
}
