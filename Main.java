import java.io.*;
import java.util.Scanner;

enum InputType{
    AC,
    DC,
    USB,
    AA_BATTERY,
    COIN_BATTERY
}

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FanFactory fanFactory = new FanFactory();
        Fan ceilingFan = fanFactory.getFan("Havells-ceiling-3-Breezer_plus");
        Fan USB_fan = fanFactory.getFan("Usha-USB-4-FaceCooler");
        Fan tableFan = fanFactory.getFan("Orient-Table-4-Compacto");
        Fan handFan = fanFactory.getFan("TinyBreeze-HAND-5-PalmStorm");
        try{
            ((HandFan)handFan).handleSize = 10;
            ((USBFan)USB_fan).efficientRange=40;
            ((TableFan)tableFan).doesSwing=true;
        }catch(Exception e){
            System.out.println("Wrong fan instatiation!");
            System.out.println(e.getMessage());
        }
        
        while(true){
        String choice = sc.next();
            if(choice.equals("0")){
                break;
            }else{
                ceilingFan.getDetails();
                USB_fan.getDetails();
                tableFan.getDetails();
                handFan.getDetails();
            }
        }
        sc.close();
    }
    
}

