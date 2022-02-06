package ru.chess.firuges.white;

import ru.chess.firuges.Cell;
import ru.chess.firuges.Figure;

public class RookWhite implements Figure {
    private final Cell position;

    public RookWhite(final Cell ps) {
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
        return new RookWhite(dest);
    }
}
