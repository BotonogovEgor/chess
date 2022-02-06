package ru.chess.firuges;

import ru.chess.ImpossibleMoveException;

public interface Figure {
    Cell position();

    Cell[] way(Cell dest) throws ImpossibleMoveException;

    default String icon() {
        return String.format(
                "%s.png", getClass().getSimpleName()
        );
    }

    Figure copy(Cell dest);
}
