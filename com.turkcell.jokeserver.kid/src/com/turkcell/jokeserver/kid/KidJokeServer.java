package com.turkcell.jokeserver.kid;

import com.turkcell.jokeserver.JokeServer;
import com.turkcell.jokeserver.kid.internal.Filter;

import java.util.List;


public class KidJokeServer implements JokeServer {
    private List<String> jokes = List.of(
            "Akılsız başın cezasını ayaklar çeker.\nBir KIRKAYAK atasözü.",
            "Cüneyt Arkın filmleri şarap gibi\ngittikçe komikleşiyor..",
            "İlahi Azrail ...\nSen adamı öldürürsün...!",
            "ÖyIe bir operatör istiyorum ki\n müşteri hizmetIerini arayınca sen kapat biz arıyaIım desin.",
            "Kızın teki facebookta duvarına “yengeç burcu kadını yaIandan ve aIdatıImaktan hiç hoşIanmaz” yazmış."
                + "\nsanki diğer burçIar aIdatıIınca haIay çekiyor.",
            "Son gülen en geç anlayandır.",
            "Başkalarının izinden gidenler, iz bırakmazlar.!",
            "İstanbul'da yürüyorum gözüm kapalı....\nIgıgıgıgghhh! Önüne baksana yaw!",
            "Yeni doğan çocuğa “kamuran” adını vermekte nedir?\n Çocuk resmen hayata 35 yasında başIıyor.",
            " Bakarak öğrenilseydi öküzler makinist olurdu.!",
            "Dün bir Amerikalı gördüm. Abi nasıl İNGİLİZCE konuşuyor görecen.!",
            "Kız arkadaşı: Ocakta yemek var... Adam: Şubat'ta boş musun?!"
    );

    private int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }

    @Override
    public String getJoke() {
        int index = getRandomInteger(jokes.size(),0) ;
        return Filter.filterBadLanguage(jokes.get(index));
    }

    @Override
    public int availableJokes() {
        return jokes.size();
    }

    @Override
    public String name() {
        return "Kid Joke Server";
    }
}
