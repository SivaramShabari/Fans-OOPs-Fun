public class TableFan extends Fan{

    float baseRadius;
    boolean doesSwing;
    boolean swingState;

    public TableFan(){
        super();
    }
    public TableFan(String modelID, int speedLevels, int operatingVoltage, int voltageFrequency, int numberOfBlades, int powerInWatts, int price){
        super(modelID, speedLevels, operatingVoltage, voltageFrequency, numberOfBlades, powerInWatts, price);
    }

    public float getBaseRadius() {
        return baseRadius;
    }
    public void setBaseRadius(float baseRadius) {
        this.baseRadius = baseRadius;
    }
    public boolean getDoesSwing() {
        return doesSwing;
    }
    public void setDoesSwing(boolean doesSwing) {
        this.doesSwing = doesSwing;
    }
    public boolean getSwingState() {
        return swingState;
    }
    public void setSwingState(boolean swingState) {
        this.swingState = swingState;
    }
}

