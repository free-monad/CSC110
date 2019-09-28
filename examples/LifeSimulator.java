/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lifesimulator2;


import java.util.Scanner;
/**
 *
 * @author msconroy
 */
public class LifeSimulator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        final String BUSINESS_MAN = "business man";
        final String ENGINEER = "engineer";
        final String ARTIST = "artist";
        final String HELPING_PROFESSION = "helping profession";
        
        final double CHANCE_OF_BUSINESS = 0.30;
        final double CHANCE_OF_ENGINEER = 0.05;
        final double CHANCE_OF_ARTIST = 0.10;
        final double CHANCE_OF_HELPING_PROFESSION = 0.30;
        
        String name;
        String wantsThisJob;
        String wantsToMarry;
        String wantsChildren;
        String isRuleBreaker;
        String willKeepInTouchWithFriends;
        String willContributeToSociety;
        String willSpendLavishly;
        
        System.out.println("Name");
        name = s.nextLine();
        System.out.println("Job?");
        wantsThisJob = s.nextLine();
        System.out.println("Marry?");
        wantsToMarry = s.nextLine();
        System.out.println("Children?");
        wantsChildren = s.nextLine();
        System.out.println("Rulebreaker?");
        isRuleBreaker = s.nextLine();
        
        
        String actualJob = "";
        String actualWealth = null;
        
        String significantOther;
        String wealthiness;
        boolean hasChildren;
        boolean hasGoneToJail;
        String child1, child2, child3, child4, child5, child6, child7;
        
        //30% business man, 30% helping professional, 10% artist, 5% engineer, 5% chronically unemployed
        final double occupationProbability = Math.random();
        
        if (occupationProbability <= 0.30){
            actualJob = BUSINESS_MAN;
        } else if (occupationProbability > 0.30 || occupationProbability <= 0.60){
            actualJob = HELPING_PROFESSION;
        } else if (occupationProbability > 0.60 || occupationProbability <= 0.65){
            actualJob = ENGINEER;
        } else if (occupationProbability > 0.65 || occupationProbability <= 0.75){
            actualJob = ARTIST;
        }
        
        switch(actualJob){
            case BUSINESS_MAN:
                if(Math.random() <= 0.70){
                    actualWealth = "rich";
                } else {
                    actualWealth = "middle class";
                }
                break;
            case ARTIST:
                if(Math.random() <= 0.10) {
                    actualWealth = "rich";
                } else{
                    actualWealth = "poor";
                }
                break;
            case ENGINEER:
                actualWealth = "rich";
                break;
            case HELPING_PROFESSION:
                actualWealth = "middle class";
                break;
        }
        
        if(isRuleBreaker.equals("yes")){
            if(Math.random() <= 0.30){
                hasGoneToJail = true;
            } else{
                actualWealth = "rich";
            }
        }
        
        String lifeParagraph = "";
        lifeParagraph += name;
        lifeParagraph += " was an interesting person.";
        
        if(wantsToMarry.equals("yes")){
            lifeParagraph += (name + " wants to marry.");
        }
        
        lifeParagraph += (name + " became a " + actualJob + "They were a " + actualWealth + " person!");
        
        
        System.out.println(lifeParagraph);
    }
        
        
}
