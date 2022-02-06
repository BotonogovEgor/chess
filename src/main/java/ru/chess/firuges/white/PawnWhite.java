package ru.chess.firuges.white;

import ru.chess.firuges.Cell;
import ru.chess.firuges.Figure;

public class PawnWhite implements Figure {
    private final Cell position;

    public PawnWhite(final Cell ps) {
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
        return new PawnWhite(dest);
    }
}
