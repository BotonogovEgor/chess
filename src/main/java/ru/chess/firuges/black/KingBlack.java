package ru.chess.firuges.black;

import ru.chess.firuges.Cell;
import ru.chess.firuges.Figure;

public class KingBlack implements Figure {
    private final Cell position;

    public KingBlack(final Cell ps) {
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
        return new KingBlack(dest);
    }
}
