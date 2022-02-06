package ru.chess.firuges.white;

import ru.chess.firuges.Cell;
import ru.chess.firuges.Figure;

public class QueenWhite implements Figure {
    private final Cell position;

    public QueenWhite(final Cell ps) {
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
        return new QueenWhite(dest);
    }
}
