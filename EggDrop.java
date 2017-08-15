import java.util.*;
public class EggDrop {
	int numOfEggs=0;
	int numOfFloors=1; //Floors in the overall building
	int strategy; //Number of Floors to go by

	Random rand= new Random();
	int floorWillCrack=0;


	public EggDrop(int eggs, int floors, int chosenStrategy){
		this.numOfEggs=eggs;
		this.numOfFloors=floors;
		this.strategy=chosenStrategy;
		this.floorWillCrack= rand.nextInt(numOfFloors)+1;
	//this.floorWillCrack= numOfFloors I think this line would be if we want the Worst-Case Scenario
	}

	//For two eggs and n floors
	public int eggDropGoingUpStrategy(){
		int numOfDrops=0;
		int goingUp=strategy;
		int goingUpBelow=0;
		if(strategy==floorWillCrack){
			return 1;
		}

		else if(strategy>floorWillCrack){
			for(int i=1; i<strategy; i++){
				if(i<floorWillCrack){
					numOfDrops++;
				}
			}
			return numOfDrops;
		}

		else{
			numOfDrops+=1;
			while(goingUp<floorWillCrack){
				goingUpBelow=goingUp;
				goingUp+=strategy;
				numOfDrops++;
			}
			for(int i=goingUpBelow; i<goingUp-goingUpBelow; i++){
				if(i<floorWillCrack){
					numOfDrops++;
				}
			}

			return numOfDrops;

		}



	}

	//For two eggs and n floors
	public int eggDropGoingUpOneStrategy(){
		int numOfDrops=0;
		int goingUp=strategy;
		int goingUpBelow=0;
		if(strategy==floorWillCrack){
			return 1;
		}
		else if(strategy>floorWillCrack){
			for(int i=1; i<strategy; i++){
				if(i<floorWillCrack){
					numOfDrops++;
				}
			}
			return numOfDrops;
		}
		
		else{
			numOfDrops+=1;
			int duplicateStrategy=strategy;
			while(goingUp<floorWillCrack){
				goingUpBelow=goingUp;
				goingUp+=duplicateStrategy-1;
				numOfDrops++;
			}
			for(int i=goingUpBelow; i<goingUp-goingUpBelow; i++){
				if(i<floorWillCrack){
					numOfDrops++;
				}
			}

			return numOfDrops;

		}
		
		
		
	}

	
	//For e eggs and n floors
	public int eggDropPseudo(int egg, int numberOfFloors){

		
		
	}



}
