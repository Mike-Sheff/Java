package Netologia.task_2_2.task_2_2_3;

public class ElectricType extends  VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}