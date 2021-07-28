public class USBFan extends Fan{
    int pinType;
    float efficientRange;

    public USBFan(){
        super();
    }
    public USBFan(String modelID, int speedLevels, int operatingVoltage, int voltageFrequency, int numberOfBlades, int powerInWatts, int price){
        super(modelID, speedLevels, operatingVoltage, voltageFrequency, numberOfBlades, powerInWatts, price);
    }


    public int getPinType() {
        return pinType;
    }

    public void setPinType(int pinType) {
        this.pinType = pinType;
    }

    public float getEfficientRange() {
        return efficientRange;
    }

    public void setEfficientRange(float efficientRange) {
        this.efficientRange = efficientRange;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("USB Powered");
    }
}