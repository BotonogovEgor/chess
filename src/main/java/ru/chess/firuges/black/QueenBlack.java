package ru.chess.firuges.black;

import ru.chess.firuges.Cell;
import ru.chess.firuges.Figure;

public class QueenBlack implements Figure {
    private final Cell position;

    public QueenBlack(final Cell ps) {
        position = ps;
    }

    @Override
    public Cell position() {
        return position;
    }

    @Override
    public Cell[] way(Cell dest) {
        return new Cell[] {
                dest
        };
    }

    @Override
    public Figure copy(Cell dest) {
        return new QueenBlack(dest);
    }
}
