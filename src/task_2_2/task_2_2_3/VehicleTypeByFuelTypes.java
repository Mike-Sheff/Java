package Netologia.task_2_2.task_2_2_3;

public class VehicleTypeByFuelTypes extends VehicleType {
    public VehicleTypeByFuelTypes() {
        super("Vehicle type by fuel");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleTypeByFuelTypes that = (VehicleTypeByFuelTypes) o;
        return attribute != null ? attribute.equals(that.attribute) : that.attribute == null;
    }
}