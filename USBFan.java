import java.util.Scanner;

public class USBFan extends Fan{

    int pinType;
    int efficientRange;

    public USBFan(){
        super();
    }

    public USBFan(String modelID, int speedLevels, int operatingVoltage, int voltageFrequency, int numberOfBlades, int powerInWatts, InputType inputType){
        super(modelID, speedLevels, operatingVoltage, voltageFrequency, numberOfBlades, powerInWatts, inputType);
    }

    public int getPinType() {
        return pinType;
    }

    public void setPinType(int pinType) {
        this.pinType = pinType;
    }

    public int getEfficientRange() {
        return efficientRange;
    }

    public void setEfficientRange(int efficientRange) {
        this.efficientRange = efficientRange;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("USB Powered");
    }

    @Override
    public String accessFan() {
        String input = super.accessFan();
        if(!input.equals("0")){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"e\" to change efficiency range of this fan: ");
        String choice = sc.next();
        if(choice.equals("s")){
            System.out.println("Enter the new efficiency range: ");
            int h = sc.nextInt();
            this.efficientRange=h;
        }else{
            System.out.println("Wrong choice...");
        }
    }
        return "";
    }
}