package com.turkcell.jokeserver.programmer;

import com.turkcell.jokeserver.JokeServer;

import java.util.List;

public class ProgrammerJokeServer implements JokeServer {
    private List<String> jokes = List.of(
        "Zengin olunca ben de kahvaltıya ineceğim. Şu an ev tek katlı olduğu için kahvaltıya düz yürüyorum.",
        "Gerçeğin er ya da geç ortaya çıkmak gibi kötü bir huyu vardır...",
        "Az önce minibüste idim. Arkadan bir kadın “Şu parayı alır mısınız” dedi. Aldım parayı cebime koydum, ne kadar iyi insanlar var bu dünyada.",
        "2 gecedir yıldız kayıyor sanıp dilek tutuyordum meğer 5. kattan komşu sigara atıyomuş.",
        "Adama sormuşIar karınızIa ortak bi özeIIiğiniz varmı? Demiş ki var aynı günde evIendik",
        "Bana Iaf atan kızIara sesIeniyorum , yapmayın sizinde abiniz babanız var.",
        "Patronuma “yeni arabanız çok güzeI” dedim."
            + "\n“eğer kendine hedefIer koyar, çok çaIışır ve işini iyi yaparsan öbür sene daha iyisini aIabiIirim” dedi.",
        "Kuaförden çıkan kız özgüven patIaması yaşarken, berberden çıkan erkek eve gitmenin en kısa yoIunu arar.",
        "Oturarak başarıya uIaşan tek varIık tavuktur."
    );

    private int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }

    @Override
    public String getJoke() {

        int index = getRandomInteger(jokes.size(),0) ;
        return jokes.get(index);
    }


    @Override
    public int availableJokes() {
        return jokes.size();
    }

    @Override
    public String name() {
        return "Programmer Joke Server";
    }
}
