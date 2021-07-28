import java.util.Scanner;

public class HandFan extends Fan {
    int handleSize;
    public HandFan(){
        super();
    }
    public HandFan(String modelID, int speedLevels, int operatingVoltage, int voltageFrequency, int numberOfBlades, int powerInWatts,  InputType inputType){
        super(modelID, speedLevels, operatingVoltage, voltageFrequency, numberOfBlades, powerInWatts, inputType);
    }
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Your handfan is of size "+this.handleSize);
    }

    @Override
    public String accessFan() {
        super.accessFan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"size\" if this hand fan's size has been changed...");
        String choice = sc.next();
        if(choice.equals("size")){
            System.out.println("Enter the new handle size: ");
            int h = sc.nextInt();
            this.handleSize=h;
        }else{
            System.out.println("Wrong choice...");
        }
        return "";
    }
}
