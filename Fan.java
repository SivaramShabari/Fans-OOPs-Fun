public class Fan{

    public Fan(){}
    public Fan(String modelID, int speedLevels, int operatingVoltage, int voltageFrequency, int numberOfBlades, int powerInWatts, int price) {
        this.modelID = modelID;
        this.speedLevels = speedLevels;
        this.operatingVoltage = operatingVoltage;
        this.voltageFrequency = voltageFrequency;
        this.numberOfBlades = numberOfBlades;
        this.powerInWatts = powerInWatts;
        this.price = price;
        this.doesSupportRemote = false;
        this.state=false;
        this.currentSpeed=0;
        this.totalRunningTime= 0;
    }

    String modelID;
    protected String name;
    protected String company;
    int speedLevels;
    boolean state;
    int operatingVoltage;
    int voltageFrequency; // 0 id DC
    int currentSpeed;
    int numberOfBlades;
    int powerInWatts;
    boolean doesSupportRemote;
    int price;
    private int totalRunningTime;
    private int lastTurnedOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    void increaseSpeed(){
        if(this.currentSpeed<speedLevels) {
            this.currentSpeed++;
            System.out.println("Speed of "+this.modelID+"is increased. The speed is now at level: "+this.currentSpeed);
        }
        else
            System.out.println("Throw error");
    }
    void decreaseSpeed(){
        if(this.currentSpeed>0){
            this.currentSpeed--;
            System.out.println("Speed of "+this.modelID+" is decreased. The speed is now at level: "+this.currentSpeed);
        }
        else
            System.out.println("Throw error");
    }
    void switchState(){
        this.state= !state;
        if(state)
            System.out.println("Turned On");
        else {
            this.totalRunningTime=this.totalRunningTime+(getCurrentTime()-this.lastTurnedOn);
            System.out.println("Turned Off");
        }
    }
    void switchState(String state){
        state=state.toLowerCase();
        if(state=="on"||state=="turn on"||state=="switch on") {
            this.state=true;
            System.out.println("Turned On");
        }
        else {
            System.out.println("Turned Off");
            this.state=false;
        }

    }
    int getCurrentTime(){
        return 12; //current time example
    }
    public void getDetails(){
        if(this.state){
            System.out.println("Fan "+this.modelID+" is turned on. It has been running for __ __ __. ");
        }else{
            System.out.println("Fan "+this.modelID+" is turned off. It has run for __ __ __. ");
        }
        System.out.println("It is in "+this.currentSpeed+" level");

    }

}