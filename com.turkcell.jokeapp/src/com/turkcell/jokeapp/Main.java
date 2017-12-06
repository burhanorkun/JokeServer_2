package com.turkcell.jokeapp;

import com.turkcell.jokeserver.JokeServer;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {

        //Time time = new Time(1);  // redundant
        ServiceLoader<JokeServer> loader = ServiceLoader.load(JokeServer.class);

        LinkedHashMap<String, JokeServer> servers = new LinkedHashMap<>();

        //servers.put("1",new KidJokeServer());
        //servers.put("2",new ProgrammerJokeServer());

        int key = 1;
        for (JokeServer s : loader){
            servers.put(String.valueOf(key), s);
            key++;
        }

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        do {

            servers.forEach((k,v) -> System.out.printf("%s: %s\n", k, v.name()));

            System.out.print("(çıkış için Q'ya basınız) : ");
            choice = scanner.nextLine().trim().toUpperCase();

            if (servers.containsKey(choice)) {
                System.out.println(servers.get(choice).getJoke() + "\n");
            } else if (!choice.equals("Q")) {
                System.out.println("Yanlış giriş, tekrar deneyiniz. ");
            }

        } while (!choice.equals("Q"));

        System.out.println("Teşekkürler! Umarım beğenmişsinizdir!!");
    }
}
