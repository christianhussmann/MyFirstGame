package com.company.be;

public class Monster {
    private int hp;
    private int maxHp;
    private int lvl;
    private int exp;

    public Monster(int lvl, int hp, int maxHp){
        setLvl(lvl);
        setHp(hp);
        setMaxHp(maxHp);
        exp = 0;

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


}
