package com.example.wallace.allcardshearthstone;

/**
 * Created by Wallace on 04/06/2015.
 */
public class Cards {
    private String name;
    private int cost;
    private int attack;
    private int health;
    private String race;
    private String card_class;
    private String card_type;
    private String description;
    private String set;
    private String rarity;
    private String artist;
    private String flavour_text;

    public Cards(){
        super();
    }
    public Cards (String name, int cost, int attack, int health, String race, String card_class,
                  String card_type, String description, String set, String rarity, String artist,
                  String flavour_text){
        super();
        this.name = name;
        this.cost = cost;
        this.attack = attack;
        this.health = health;
        this.race = race;
        this.card_class = card_class;
        this.card_type = card_type;
        this.description = description;
        this.set = set;
        this.rarity = rarity;
        this.artist = artist;
        this.flavour_text = flavour_text;
    }

    public String getName(){
        return name;
    }
    public int getCost(){
        return cost;
    }
    public int getAttack(){
        return attack;
    }
    public int getHealth(){
        return health;
    }
    public String getRace(){
        return race;
    }
    public String getCard_class(){
        return card_class;
    }
    public String getCard_type(){
        return card_type;
    }
    public String getDescription(){
        return description;
    }
    public String getSet(){
        return set;
    }
    public String getRarity(){
        return rarity;
    }
    public String getArtist(){
        return artist;
    }
    public String getFlavour_text(){
        return flavour_text;
    }

}
