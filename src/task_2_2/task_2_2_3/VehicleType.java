package Netologia.task_2_2.task_2_2_3;

public class VehicleType {
    protected String attribute;

    public VehicleType (String attribute){
        this.attribute = attribute;
    }

    String getAttributeOfType() {
        return attribute;
    }
    String getTypeName() {
        return "Some vehicle type name";
    }
}
