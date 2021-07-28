import java.util.Scanner;

public abstract class Fan{

    public Fan(){}

    public Fan(String modelID, int speedLevels, int operatingVoltage, int voltageFrequency, int numberOfBlades, int powerInWatts,  InputType inputType) {
        this.speedLevels = speedLevels;
        this.operatingVoltage = operatingVoltage;
        this.voltageFrequency = voltageFrequency;
        this.numberOfBlades = numberOfBlades;
        this.powerInWatts = powerInWatts;
        this.state=false;
        this.currentSpeed=0;
        this.inputType=inputType;
    }

    InputType inputType;
    String modelID;
    String name;
    String company;
    int speedLevels;
    boolean state;
    int operatingVoltage;
    int voltageFrequency; // 0 is DC
    int currentSpeed;
    int numberOfBlades;
    int powerInWatts;

    void increaseSpeed(){
        if(this.currentSpeed<speedLevels) {
            this.currentSpeed++;
            System.out.println("Speed of "+this.modelID+"is increased. The speed is now at level: "+this.currentSpeed);
        }
        else
            System.out.println("Speed can't be increased.");
    }
    void decreaseSpeed(){
        if(this.currentSpeed>0){
            this.currentSpeed--;
            System.out.println("Speed of "+this.modelID+" is decreased. The speed is now at level: "+this.currentSpeed);
        }
        else
            System.out.println("Speed can't be decreased.");
    }
    void switchState(){
        this.state= !state;
        if(state)
            System.out.println(this.company+" - "+this.name+", Turned On");
        else 
            System.out.println(this.company+" - "+this.name+", Turned Off");
    }
    void switchState(String state){
        state=state.toLowerCase();
        if(state=="on"||state=="turn on"||state=="switch on") {
            this.state=true;
            System.out.println(this.company+" - "+this.name+", Turned On");
        }
        else {
            System.out.println(this.company+" - "+this.name+", Turned Off");
            this.state=false;
        }

    }

    public void getDetails(){
        System.out.println("\n");
        if(this.state){
            System.out.println(this.company+" - "+this.name+", is turned on ");
        }else{
            System.out.println(this.company+" - "+this.name+", is turned off ");
        }
        System.out.println("It is in "+this.currentSpeed+" level");
    }

    public String accessFan(){
        Scanner sc = new Scanner(System.in);
        String choice;
        while(true){
        System.out.println("\n\n\nYou are now using "+this.company+"-"+this.name);
        System.out.println("Enter 0 to view other fans");
        System.out.println("Enter 1 to turn the fan on/off ");
        if(speedLevels>0 ){
            System.out.println("Enter \"increase\" to increase speed");
            System.out.println("Enter \"decrease\" to decrease speed");
        }
        System.out.println("Enter \"change\" to change other properties");
        choice = sc.next();
            if(choice.equals("0")){
                break;
            }else if(choice.equals("1")){
                this.switchState();
            }else if(choice.equals("increase")){
                this.increaseSpeed();
            }else if(choice.equals("decrease")){
                this.decreaseSpeed();
            }else if(choice.equals("change")){
                
                break;
            }else{
                System.out.println("Wrong choice...");
            }
        }
        
        return choice;
    }


}


