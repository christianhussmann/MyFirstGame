package com.company.be;

public class MonsterAbility {
    public int dmg;
    public int heal;
    public String name;

    public MonsterAbility(String name, int dmg) {
        this.name = name;
        this.dmg = dmg;
    }
    public MonsterAbility(String name, int dmg, int heal) {
        this.name = name;
        this.dmg = dmg;
        this.heal = heal;
    }

}
