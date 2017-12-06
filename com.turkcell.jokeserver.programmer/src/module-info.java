module com.turkcell.jokeserver.programmer {
    requires com.turkcell.jokeserver;
    requires transitive java.sql;

    //exports com.turkcell.jokeserver.programmer;

    provides com.turkcell.jokeserver.JokeServer
        with com.turkcell.jokeserver.programmer.ProgrammerJokeServer;
}
