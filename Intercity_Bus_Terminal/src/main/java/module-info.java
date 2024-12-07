module finalproject.intercity_bus_terminal {
    requires javafx.controls;
    requires javafx.fxml;


    opens finalproject.intercity_bus_terminal to javafx.fxml;
    exports finalproject.intercity_bus_terminal;
}