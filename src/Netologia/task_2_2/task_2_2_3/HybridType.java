package Netologia.task_2_2.task_2_2_3;

public class HybridType extends  VehicleTypeByFuelTypes {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}