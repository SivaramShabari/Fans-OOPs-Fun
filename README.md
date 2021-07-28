# Fun with Fans

_This program can resemble accesing of fans in a smart home or some kinda smart devices that can control all fans ..._

There are pre defined fans that you can access and modify while the program is running

**The Fan class has all the common functionalties tht all fans have...**

# 1) Added a hand-fan sub class

# 2) The basic functionalities are in Fan class and overridden by the sub classes

# 3) What should happen when swing is attempted in off state for table fan?

    public void setSwingState(boolean swingState) {
        if(this.state)
            this.swingState = swingState;
        else
            System.out.println("The fan is not running, please change the swing funcion when it is turned on!");
    }

if this.state is false, i.e. if the fan is **turned off** it would say so...

###

Or we can do anything we want, like if the swingState is switched when the fan is off we can cache that and apply that when the fan is turned on...

# 4) How will on/off or speed functionality apply to USB fan and hand fan?

I assumed that all fans have on/off buttons/feature, so we can control them here!

###

If we try to change speed of hand/USB fans it would do nothing and send a message saying that it can't be increased/decreased...

###

**This is because, I have declared a attribute in the Fan class to maintain number of speed levels. If it is 0 then it neither can be increased nor decreased as shown below**

######

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

### The unique attributes for the different types of fans are implemented by overriding parent class's methods. Also the common functionalities are defined in the parent class itself and the super.method is used when overriding...

#### Example:

    @Override
    public String accessFan() {
        String input = super.accessFan();
        if(!input.equals("0")){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter \"s\" to change swinging state of this fan: ");
            String choice = sc.next();
            if(choice.equals("s")){
                this.setSwingState(!this.swingState);
            }else{
                System.out.println("Wrong choice...");
            }

        }
        return "";
    }

### The FanFactory class uses factory design pattern to generate fans based on the model ID given to it.

- I've used details of fans from the model id itself, but it can be fetched from a database and then be processed accordingly.
- #### Example model-id: Havells-table-4-BreezeHeaven
- **Havells** is the company attribute
- **table** is the type of fan, based on which the factory builder return different fan type
- Number **4** is number of blades
- **BreezeHeaven** is the name of the fan.

#####

### In Main.java I have defined an enum class for the input types of the fan, ie if it is a fan working with AC current or batteries etc...

## Instantiating different fan types:

    FanFactory fanFactory = new FanFactory();
        Fan ceilingFan = fanFactory.getFan("Havells-ceiling-3-Breezer_plus");
        Fan USB_fan = fanFactory.getFan("Usha-USB-4-FaceCooler");
        Fan tableFan = fanFactory.getFan("Orient-Table-4-Compacto");
        Fan handFan = fanFactory.getFan("TinyBreeze-HAND-5-PalmStorm");

Based on the model id's (as defined in Factory builder class), it creates the rescpective fan type class

### Typecasting the Fan class to the required sub-class, if there is a need to change the sub class's attributes manually...

    try{
            ((HandFan)handFan).handleSize = 10;
            ((USBFan)USB_fan).efficientRange=40;
            ((TableFan)tableFan).doesSwing=true;
        }catch(Exception e){
            System.out.println("Wrong fan instatiation!");
            System.out.println(e.getMessage());
        }

### The infinite loop is to access each fan indefinitely untill we decide to quit.

### There isn't much features here, I'm wondering what else to add...
