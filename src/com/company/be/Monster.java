package com.company.be;

import java.util.ArrayList;

public class Monster implements IMonster {
    private int hp;
    private int maxHp;
    private int lvl;
    private int exp;
    private String name;
    private ArrayList<MonsterAbility> getAbilities;
    private IMonster counterMonster;


    public Monster(String name,int lvl, int hp, int maxHp){
        this.name = name;
        this.lvl = lvl;
        this.hp = hp;
        this.maxHp = maxHp;
        exp = 0;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }



    @Override
    public ArrayList<MonsterAbility> getAbilities() {
        return getAbilities;
    }


    @Override
    public IMonster getCounterMonster() {
        return null;
    }

    @Override
    public void setCounterMonster(IMonster counterMonster) {

    }
}
