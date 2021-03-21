package com.company.bll.game;

import com.company.Game;
import com.company.be.IMonster;
import com.company.be.Monster;
import com.company.be.MonsterAbility;

public class GameManager {


    public void initializeGame() {
        //All Monsters have these abilities.
        MonsterAbility tackle = new MonsterAbility("Tackle", 5);

        //CrystalMonster abilities.
        MonsterAbility sapphireDeflection = new MonsterAbility("SapphireDeflection",10);
        MonsterAbility bulletGems = new MonsterAbility("Bullet Gems",15);
        MonsterAbility diamondThrow = new MonsterAbility("Diamond Throw", 12);
        //b

        //WindMonster abilities.
        MonsterAbility windBlow = new MonsterAbility("Wind Blow",7);
        MonsterAbility wildTornado = new MonsterAbility("Wild Tornado", 20);
        MonsterAbility aerialThrow = new MonsterAbility("Aerial Throw", 15);

        //MagmaMonster abilities.
        MonsterAbility fireBall = new MonsterAbility("Fire Ball", 10);
        MonsterAbility burningBoulders = new MonsterAbility("Burning Boulders", 15);
        MonsterAbility eruption = new MonsterAbility("Eruption", 20);
        MonsterAbility smeltingEarthquake = new MonsterAbility("Smelting Earthquake", 20);

        //MetalMonster abilities.
        MonsterAbility hardenedTackle = new MonsterAbility("Hardened Tackle", 8);
        MonsterAbility titaniumPunch = new MonsterAbility("Titanium Punch", 20);
        MonsterAbility goldDrop = new MonsterAbility("Gold Drop", 5);

        //NatureMonster abilities.
        MonsterAbility leafStorm = new MonsterAbility("Leaf Storm", 10);
        MonsterAbility hammerLog = new MonsterAbility("Hammer Log", 20);
        MonsterAbility naturesLife = new MonsterAbility("Natures Life", 0, 5);

        //ShadowMonster abilities.
        MonsterAbility darkSword = new MonsterAbility("Dark Sword Slash", 15);
        MonsterAbility fullDarkness = new MonsterAbility("Full Darkness", 12, 5);
        MonsterAbility nightSpeed = new MonsterAbility("Night Speed", 8);
        MonsterAbility devilBurst = new MonsterAbility("Devil Burst", 20);

        //LightMonster abilities.
        MonsterAbility brightShine = new MonsterAbility("Bright Shine", 10);
        MonsterAbility lightningSpear = new MonsterAbility("Lightning Spear", 20);
        MonsterAbility glancingSun = new MonsterAbility("Glancing Sun", 10);

        //OceanMonster abilities.
        MonsterAbility geiserShot = new MonsterAbility("Geiser Shot", 20);
        MonsterAbility waterCannon = new MonsterAbility("Water Cannon", 12);
        MonsterAbility splashWave = new MonsterAbility("Splash Wave", 5);
        MonsterAbility rainStorm = new MonsterAbility("Rain Storm", 10);

        //NeutralMonster abilities.
        MonsterAbility neutralTackle = new MonsterAbility("Neutral Tackle", 5);
        MonsterAbility bulletPunch = new MonsterAbility("Bullet Punch", 15);
        MonsterAbility bodyThrow = new MonsterAbility("Body Throw", 10);
        MonsterAbility stomp = new MonsterAbility("Stomp", 8);

        //IceMonster Abilities.
        MonsterAbility iceShardToss = new MonsterAbility("Ice Shard Toss", 12);
        MonsterAbility frozenWinds = new MonsterAbility("Frozen Winds", 18);
        MonsterAbility icePunch = new MonsterAbility("Ice Punch", 15);
        MonsterAbility icicleVengeance = new MonsterAbility("Icicle Vengeance", 10);

        //MythicMonster Abilities.
        //Still in development, need more abilities.
        MonsterAbility dragonDemolish = new MonsterAbility("Dragon Demolish", 25);
        MonsterAbility godsBless = new MonsterAbility("Gods Bless", 0,10);




        new Game();
        //All monsters implemented and have special hp and dmg, and maxHP.
        IMonster lightMonster = new Monster("Light Monster",1,20,100);
        IMonster shadowMonster = new Monster("Shadow Monster",1,20,100);
        IMonster crystalMonster = new Monster("Crystal Monster",1,20,100);
        IMonster iceMonster = new Monster("Ice Monster", 1,20,100);
        IMonster magmaMonster = new Monster("Magma Monster", 1,20,100);
        IMonster metalMonster = new Monster("Metal Monster", 1,20,100);
        IMonster natureMonster = new Monster("Nature Monster", 1,20,100);
        IMonster neutralMonster = new Monster("Neutral Monster", 1,20,100);
        IMonster oceanMonster = new Monster("Ocean Monster", 1,20,100);
        IMonster windMonster = new Monster("Ocean Monster", 1,20,100);
        IMonster mythicMonster = new Monster("Mythic Monster", 1,40,200);

        //CrystalMonsters have these abilities and counters.
        //counters
        crystalMonster.setCounterMonster(shadowMonster);
        crystalMonster.setCounterMonster(windMonster);
        //abilities
        crystalMonster.getAbilities().add(tackle);
        crystalMonster.getAbilities().add(sapphireDeflection);
        crystalMonster.getAbilities().add(bulletGems);
        crystalMonster.getAbilities().add(diamondThrow);

        //WindMonsters have these abilities and counters.
        //counters
        windMonster.setCounterMonster(natureMonster);
        windMonster.setCounterMonster(neutralMonster);
        //abilities
        windMonster.getAbilities().add(tackle);
        windMonster.getAbilities().add(windBlow);
        windMonster.getAbilities().add(wildTornado);
        windMonster.getAbilities().add(aerialThrow);

        //MagmaMonsters have these abilities and counters.
        //counters
        magmaMonster.setCounterMonster(metalMonster);
        magmaMonster.setCounterMonster(natureMonster);
        magmaMonster.setCounterMonster(iceMonster);
        //abilities
        magmaMonster.getAbilities().add(tackle);
        magmaMonster.getAbilities().add(fireBall);
        magmaMonster.getAbilities().add(burningBoulders);
        magmaMonster.getAbilities().add(eruption);
        magmaMonster.getAbilities().add(smeltingEarthquake);

        //MetalMonsters have these abilities and counters.
        //counters
        metalMonster.setCounterMonster(windMonster);
        metalMonster.setCounterMonster(natureMonster);
        metalMonster.setCounterMonster(neutralMonster);
        //abilities
        metalMonster.getAbilities().add(tackle);
        metalMonster.getAbilities().add(hardenedTackle);
        metalMonster.getAbilities().add(titaniumPunch);
        metalMonster.getAbilities().add(goldDrop);

        //NatureMonsters have these abilities and counters.
        //counters
        natureMonster.setCounterMonster(oceanMonster);
        natureMonster.setCounterMonster(iceMonster);
        //abilities
        natureMonster.getAbilities().add(tackle);
        natureMonster.getAbilities().add(leafStorm);
        natureMonster.getAbilities().add(hammerLog);
        natureMonster.getAbilities().add(naturesLife);

        //ShadowMonsters have these abilities and counters.
        //counters
        shadowMonster.setCounterMonster(lightMonster);
        shadowMonster.setCounterMonster(crystalMonster);
        //abilities
        shadowMonster.getAbilities().add(tackle);
        shadowMonster.getAbilities().add(darkSword);
        shadowMonster.getAbilities().add(fullDarkness);
        shadowMonster.getAbilities().add(nightSpeed);
        shadowMonster.getAbilities().add(devilBurst);

        //LightMonsters have these abilities and counters.
        //counters
        lightMonster.setCounterMonster(natureMonster);
        lightMonster.setCounterMonster(shadowMonster);
        //abilities
        lightMonster.getAbilities().add(tackle);
        lightMonster.getAbilities().add(brightShine);
        lightMonster.getAbilities().add(lightningSpear);
        lightMonster.getAbilities().add(glancingSun);

        //OceanMonsters have these abilities and counters.
        //counters
        oceanMonster.setCounterMonster(magmaMonster);
        oceanMonster.setCounterMonster(metalMonster);
        //abilities
        oceanMonster.getAbilities().add(tackle);
        oceanMonster.getAbilities().add(geiserShot);
        oceanMonster.getAbilities().add(waterCannon);
        oceanMonster.getAbilities().add(splashWave);
        oceanMonster.getAbilities().add(rainStorm);

        //NeutralMonsters have these abilities and counters.
        //counters
        neutralMonster.setCounterMonster(neutralMonster);
        neutralMonster.setCounterMonster(iceMonster);
        //abilities
        neutralMonster.getAbilities().add(tackle);
        neutralMonster.getAbilities().add(neutralTackle);
        neutralMonster.getAbilities().add(bulletPunch);
        neutralMonster.getAbilities().add(bodyThrow);
        neutralMonster.getAbilities().add(stomp);

        //IceMonsters have these abilities and counters.
        //counters
        iceMonster.setCounterMonster(metalMonster);
        iceMonster.setCounterMonster(mythicMonster);
        //abilities
        iceMonster.getAbilities().add(tackle);
        iceMonster.getAbilities().add(iceShardToss);
        iceMonster.getAbilities().add(frozenWinds);
        iceMonster.getAbilities().add(icePunch);
        iceMonster.getAbilities().add(icicleVengeance);

        //MythicMonsters have these abilities and counters.
        //counters
        mythicMonster.setCounterMonster(crystalMonster);
        mythicMonster.setCounterMonster(mythicMonster);
        //abilities
        mythicMonster.getAbilities().add(tackle);
        mythicMonster.getAbilities().add(dragonDemolish);
        mythicMonster.getAbilities().add(godsBless);





        IMonster attackingMonster = new Monster("", 2, 3,40);
    }



}
