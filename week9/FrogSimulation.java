// 2018 FRQ Q1
package week9;

public class FrogSimulation {

    private int goalDistance;
    private int maxHops;

    private int hopDistance(){
        return 3;
    }

    public boolean Simulate(){
        int Position=0;
        for(int i=1; i<=maxHops; i++){
            Position+=hopDistance();
            if (Position<0) return false;
            else if(Position>=goalDistance) {
                return true;
            }
        }
        return false;
    }

	public double runSimulations(int num)
	{ 
        int success=0;
        for(int i=0;i<num;i++){
            if (Simulate()) success++;
        }
        return (double) success/num;
    }
	


}
