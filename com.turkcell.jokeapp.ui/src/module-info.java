module com.turkcell.jokeapp.ui {

    requires com.turkcell.jokeserver;
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;

    uses com.turkcell.jokeserver.JokeServer;

    opens com.turkcell.jokeapp.ui to javafx.fxml, javafx.graphics;
}


