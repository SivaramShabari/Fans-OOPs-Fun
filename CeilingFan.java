import java.util.Scanner;

public class CeilingFan extends Fan{

    public CeilingFan(){
        super();
    }

    public CeilingFan(String modelID, int speedLevels, int operatingVoltage, int voltageFrequency, int numberOfBlades, int powerInWatts ,InputType inputType){
        super(modelID, speedLevels, operatingVoltage, voltageFrequency, numberOfBlades, powerInWatts, inputType);
        this.hangingHeight=1;
        this.airAreaCoverage=64;
    }

    int hangingHeight;
    int airAreaCoverage;

    public int getHangingHeight() {
        return hangingHeight;
    }

    public void setHangingHeight(int hangingHeight) {
        this.hangingHeight = hangingHeight;
    }

    public int getAirAreaCoverage() {
        return airAreaCoverage;
    }

    public void setAirAreaCoverage(int airAreaCoverage) {
        this.airAreaCoverage = airAreaCoverage;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("It is "+this.hangingHeight+" feet below the ceiling and it is keeping an area of "+this.airAreaCoverage+"square feet breezy");
    }

    @Override
    public String accessFan() {
        super.accessFan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter \"height\" if this ceiling fan's hanging height has been changed...");
        System.out.println("Enter \"area\" if this ceiling fan's coverage area has been changed...");
        String choice = sc.next();
        if(choice.equals("height")){
            this.switchState();
            }else if(choice.equals("area")){
            System.out.println("Enter the new hanging height: ");
            int h = sc.nextInt();
            this.hangingHeight=h;
        }else if(choice.equals("2")){
            System.out.println("Enter the area covered: ");
            int a = sc.nextInt();
            this.airAreaCoverage=a;
        }else{
            System.out.println("Wrong choice...");
        }
        sc.close();
        return "";
    }
}