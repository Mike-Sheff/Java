package Netologia.task_2_2.task_2_2_3;

public class WagonType extends  VehicleTypeByBodyTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}