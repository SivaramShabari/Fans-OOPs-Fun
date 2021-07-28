import java.util.Scanner;

public class TableFan extends Fan{

    int baseRadius;
    boolean doesSwing;
    boolean swingState;

    public TableFan(){
        super();
    }
    public TableFan(String modelID, int speedLevels, int operatingVoltage, int voltageFrequency, int numberOfBlades, int powerInWatts, InputType inputType){
        super(modelID, speedLevels, operatingVoltage, voltageFrequency, numberOfBlades, powerInWatts, inputType);
    }

    public boolean getSwingState() {
        return swingState;
    }
    public void setSwingState(boolean swingState) {
        if(this.state)
            this.swingState = swingState;
        else    
            System.out.println("The fan is not running, please change the swing funcion when it is turned on!");
    }
    @Override
    public String accessFan() {
        super.accessFan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"s\" to change swinging state of this fan: ");
        String choice = sc.next();
        if(choice.equals("s")){
            this.setSwingState(!this.swingState);
        }else{
            System.out.println("Wrong choice...");
        }
        sc.close();
        return "";
    }
}

