package com.company.gui;

import com.company.bll.game.GameManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, monsterLabel, monsterLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN,90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN,28);
    JButton startButton, choice1, choice2, choice3, choice4, choice5;
    JTextArea mainTextArea;
    int monsterHP;
    String monster, position;
    int enemyMonsterHP;
    String enemyMonster;

    titleScreenHandler tsHandler = new titleScreenHandler();
    choiceHandler cHandler = new choiceHandler();
/*
    public static void main(String[] args) {

        GameManager gm = new GameManager();
        gm.initializeGame();

    }
    */

    public void startGame() {
        GameManager gm = new GameManager();
        gm.initializeGame();
    }



    public SwingApp(){

        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,100, 600,150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("MEHMON");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    public void createGameScreen(){
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(5,1));
        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choiceButtonPanel.add(choice1);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("c1");

        choice2 = new JButton("Choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("c2");

        choice3 = new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choiceButtonPanel.add(choice3);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("c3");


        choice4 = new JButton("Choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choiceButtonPanel.add(choice4);
        choice4.setFocusPainted(false);
        choice4.addActionListener(cHandler);
        choice4.setActionCommand("c4");


        choice5 = new JButton("Choice 5");
        choice5.setBackground(Color.black);
        choice5.setForeground(Color.white);
        choice5.setFont(normalFont);
        choiceButtonPanel.add(choice5);
        choice5.setFocusPainted(false);
        choice5.addActionListener(cHandler);
        choice5.setActionCommand("c5");


        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,600,50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));
        con.add(playerPanel);

        hpLabel = new JLabel("HP:");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);

        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(normalFont);
        hpLabelNumber.setForeground(Color.white);
        playerPanel.add(hpLabelNumber);

        monsterLabel = new JLabel("Monster:");
        monsterLabel.setFont(normalFont);
        monsterLabel.setForeground(Color.white);
        playerPanel.add(monsterLabel);

        monsterLabelName = new JLabel();
        monsterLabelName.setFont(normalFont);
        monsterLabelName.setForeground(Color.white);
        playerPanel.add(monsterLabelName);

        playerSetup();

    }
    public void enemyMonster(){
        enemyMonsterHP = 15;
        enemyMonster = "Magmamon";
    }

    public void playerSetup(){
        monsterHP = 20;
        monster = "Toxinflayer";
        monsterLabelName.setText(monster);
        hpLabelNumber.setText(""+monsterHP);

        startMenu();
    }

    public void startMenu(){
        position = "startMenu";
        mainTextArea.setText("You are few steps away from Adventure!");
        choice1.setText("Start Adventure");
        choice2.setText("Load Saved Game");
        choice3.setText("Options");
        choice4.setText("How to?");
        choice5.setText("Close");
    }

    public void startAdventure(){
        position = "startAdventure";
        mainTextArea.setText("You Wander around in the forest\nWarning !!! A wild Mehmon attacks you!");
        choice1.setText("Fight");
        choice2.setText("Flee");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("");

    }
    public void loadExistingGame(){

    }

    public void howTo(){

    }

    public void closeApplication(){

    }
    public void startMenuOptions(){
        position = "startMenuOptions";
        mainTextArea.setText("Options");
        choice1.setText("Mute Sound");
        choice2.setText("Volume");
        choice3.setText("Credits");
        choice4.setText("");
        choice5.setText("");
    }

    public void fleeFromMonster(){
        position = "fleeFromMonster";
        mainTextArea.setText("You run away.");
        mainTextArea.setText("The monster looks at you running away.");
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice5.setText("");
    }

    public void attackMonster(){
        position = "attackMonster";
        mainTextArea.setText("You go into battle with the monster.");
        choice1.setText("Tackle");
        choice2.setText("Kick");
        choice3.setText("Spit");
        choice4.setText("Throw Stone");
        choice5.setText("Heal");
    }

    public void tackleAttack(){

    }

    public void kickAttack(){

    }

    public void spitAttack(){

    }

    public void throwStoneAttack(){

    }

    public void healOption(){

    }



    public class titleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            createGameScreen();
        }
    }




    public class choiceHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){

            String yourChoice = event.getActionCommand();

            switch(position){
                    case "startMenu":
                    switch (yourChoice){
                        case "c1": startAdventure(); break;
                        case "c2": loadExistingGame(); break;
                        case "c3": startMenuOptions(); break;
                        case "c4": howTo(); break;
                        case "c5": closeApplication(); break;
                    }
                    break;
                    case "startAdventure" :
                    switch (yourChoice){
                        case "c1": attackMonster(); break;
                        case "c2": fleeFromMonster(); break;
                    }
                    break;
                    case "attackMonster":
                    switch (yourChoice) {
                        case "c1":
                            tackleAttack();
                            mainTextArea.setText("Tackle seem to be effective (You do 4 Damage.)");
                            enemyMonsterHP = enemyMonsterHP -4;

                            break;
                        case "c2":
                            kickAttack();
                            break;
                        case "c3":
                            spitAttack();
                            break;
                        case "c4":
                            throwStoneAttack();
                            break;
                        case "c5":
                            healOption();
                            break;
                    }
                    break;
                    case "fleeFromMonster":
                    switch (yourChoice){
                        case "c1": startMenu(); break;


            }
            }


        }
    }
}
