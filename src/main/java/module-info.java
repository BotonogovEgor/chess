module chess {
    requires javafx.fxml;
    requires javafx.controls;
    opens ru.chess to javafx.fxml;
    exports ru.chess;
}