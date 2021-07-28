public class CeilingFan extends Fan{
    public CeilingFan(){
        super();
    }
    public CeilingFan(String modelID, int speedLevels, int operatingVoltage, int voltageFrequency, int numberOfBlades, int powerInWatts, int price){
        super(modelID, speedLevels, operatingVoltage, voltageFrequency, numberOfBlades, powerInWatts, price);
        this.isChandelierType=false;
        this.hangingHeight=1;
        this.airAreaCoverage=64;
        isLightOn=false;
    }

    float hangingHeight;
    boolean isChandelierType;
    int airAreaCoverage;
    boolean isLightOn;
    public float getHangingHeight() {
        return hangingHeight;
    }

    public void setHangingHeight(float hangingHeight) {
        this.hangingHeight = hangingHeight;
    }

    public boolean getChandelierType() {
        return isChandelierType;
    }

    public void setChandelierType(boolean chandelierType) {
        isChandelierType = chandelierType;
    }

    public int getAirAreaCoverage() {
        return airAreaCoverage;
    }

    public void setAirAreaCoverage(int airAreaCoverage) {
        this.airAreaCoverage = airAreaCoverage;
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public void setLightOn(boolean lightOn) {
        isLightOn = lightOn;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if(getChandelierType()){
            if(isLightOn()){
                System.out.println("Chandelier's light is turned on.");
            }
            else {
                System.out.println("Chandelier's light is turned on.");
            }
        }else{
            System.out.println("Not a chandelier fan.");
        }
        System.out.println("It is "+this.hangingHeight+" feet below the ceiling and it is keeping an area of "+this.airAreaCoverage+"square feet breezy");
    }
}