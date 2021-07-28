public class FanFactory {
    public Fan getFan(String modelID){

        //We can fetche model details from database, but here lets assume that it is available in the model-id itself

        String[] details = modelID.split("-");
        String company = details[0];
        String type = details[1].toLowerCase();
        int bladeCount = Integer.parseInt(details[2]);
        String name = details[3];

        if(type.equals("usb")){
            Fan fan = new USBFan(modelID, 0, 12, 0, bladeCount, 12, InputType.USB);
            fan.company = company;
            fan.name=name;
            return fan;
        }else if(type.equals("ceiling")){
            Fan fan = new CeilingFan(modelID, 6, 230, 49, bladeCount, 500, InputType.AC);
            fan.company = company;
            fan.name=name;
            return fan;
        }else if(type.equals("hand")){
            Fan fan = new HandFan(modelID, 0, 12, 0, bladeCount, 12, InputType.AA_BATTERY);
            fan.company = company;
            fan.name=name;
            return fan;
        }else if(type.equals("table")){
            Fan fan = new TableFan(modelID, 3, 230, 49, bladeCount, 300, InputType.AC);
            fan.company = company;
            fan.name=name;
            return fan;
        }else{
            return new CeilingFan();
        }

    }
}
