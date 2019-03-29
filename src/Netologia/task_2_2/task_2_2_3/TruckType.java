package Netologia.task_2_2.task_2_2_3;

public class TruckType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}