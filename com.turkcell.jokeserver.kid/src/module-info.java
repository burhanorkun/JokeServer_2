module com.turkcell.jokeserver.kid {
    requires com.turkcell.jokeserver;

    //exports com.turkcell.jokeserver.kid;

    provides com.turkcell.jokeserver.JokeServer
        with com.turkcell.jokeserver.kid.KidJokeServer;

}
