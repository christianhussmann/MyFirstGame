package com.company.be.monster;

import java.util.ArrayList;

public interface IMonster {
    public void setName(String name);

    public String getName();

    public int getHp();

    public void setHp(int hp);

    public int getMaxHp();

    public void setMaxHp(int maxHp);

    public int getLvl();

    public void setLvl(int lvl);

    public int getExp();

    public void setExp(int exp);

    public ArrayList<MonsterAbility> getAbilities();

    public IMonster getCounterMonster();

    public void setCounterMonster(IMonster counterMonster);
}
