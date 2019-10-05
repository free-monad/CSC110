/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author msconroy
 */
public class LifeSimulator3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	//INITIALIZE VARIABLES
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
        
	//ASK FOR USER INPUT
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
	int numberOfChildren = 0;
        boolean hasGoneToJail;
        String child1n, child2n, child3n, child4n, child5n, child6n, child7n;
        String child1g, child2g, child3g, child4g, child5g, child6g, child7g;

	child1n = "john";
	child2n = "luke";
	child3n = "mark";
	child4n = "paul";
	child5n = "mary";
	child6n = "cindy";
	child7n = "sally";

	child1g = "male";
	child2g = "male";
	child3g = "male";
	child4g = "male";
	child5g = "female";
	child6g = "female";
	child7g = "female";

	//START GENERATING THE MODEL
	
/*
	There is a 30% chance they will have no children and a 10% chance of having 1 child, 10% of having 2 children, 10% chance of having 3 children, 10% chance of having 4 children, 10% chance of having 5 children, a 10% chance of having 6 children, and a 10% chance of having 7 children.
	
*/
	double childProb = Math.random();

	if(childProb <= 0.30){
		hasChildren = false;
	} else {
		hasChildren = true;
		if(childProb > 0.30 && childProb <= 0.40){
			numberOfChildren = 1;
		} else if (childProb > 0.40 && childProb <= 0.50){
			numberOfChildren = 2;
		} else if (childProb > 0.50 && childProb <= 0.60){
			numberOfChildren = 3;
		} else if (childProb > 0.60 && childProb <= 0.70){
			numberOfChildren = 4;
		} else if (childProb > 0.70 && childProb <= 0.80){
			numberOfChildren = 5;
		} else if (childProb > 0.80 && childProb <= 0.90){
			numberOfChildren = 6;
		} else if (childProb > 0.9 && childProb <= 1){
			numberOfChildren = 7;
		}
	}
	


        //30% business man, 30% helping professional, 10% artist, 5% engineer, 5% chronically unemployed
        final double occupationProbability = Math.random();
        
        if (occupationProbability <= 0.30){
            actualJob = BUSINESS_MAN;
        } else if (occupationProbability > 0.30 && occupationProbability <= 0.60){
            actualJob = HELPING_PROFESSION;
        } else if (occupationProbability > 0.60 && occupationProbability <= 0.65){
            actualJob = ENGINEER;
        } else if (occupationProbability > 0.65 && occupationProbability <= 0.75){
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
       

	



	//START BUILDING THE LIFE PARAGRAPH
        String lifeParagraph = "";
        lifeParagraph += name;
        lifeParagraph += " was an interesting person.";
        
        if(wantsToMarry.equals("yes")){
            lifeParagraph += (name + " wants to marry.");
        }
        
        lifeParagraph += (name + " became a " + actualJob + "They were a " + actualWealth + " person!");
        
	if(hasChildren){
		//state they have children
		lifeParagraph += "They had " + numberOfChildren + " children!";
		if(wantsChildren.equals("yes")){
			//they are happy the had children
			lifeParagraph += "They are soooo happy!! :)";
		} else{
			//the children really stress them out
			lifeParagraph += "The children really stress them out!";
		}
		//list children
		
		if(numberOfChildren >= 1){
			lifeParagraph += "Their 1st child was named " + child1n + ". ";
			lifeParagraph += "They were " + child1g + ". ";
		}

		if(numberOfChildren >= 2){
			lifeParagraph += "Their 2nd child was named " + child2n + ". ";
			lifeParagraph += "They were " + child2g + ". ";
		}
		if(numberOfChildren >= 3){
			lifeParagraph += "Their 3rd child was named " + child3n + ". ";
			lifeParagraph += "They were " + child3g + ". ";
		}
		if(numberOfChildren >= 4){
			lifeParagraph += "Their 4th child was named " + child4n + ". ";
			lifeParagraph += "They were " + child4g + ". ";
		}
		if(numberOfChildren >= 5){
			lifeParagraph += "Their 5th child was named " + child5n + ". ";
			lifeParagraph += "They were " + child5g + ". ";
		}
		if(numberOfChildren >= 6){
			lifeParagraph += "Their 6th child was named " + child6n + ". ";
			lifeParagraph += "They were " + child6g + ". ";
		}
		if(numberOfChildren >= 7){
			lifeParagraph += "Their 7th child was named " + child7n + ". ";
			lifeParagraph += "They were " + child7g + ". ";
		}

	} else {
		if(wantsChildren.equals("yes")){
			//they cried every night because they had no progreny	
			lifeParagraph += "They cried every night because they had no offspring";
		} else{
			//they consider themselves the luckiest person in the world
			lifeParagraph += "They lucked out by not getting burdened with children.";
		}
		
	}
        
        System.out.println(lifeParagraph);
    }
        
        
}
