package Netologia.task_2_2.task_2_2_3;

public class VehicleTypeByBodyTypes extends VehicleType {
    public VehicleTypeByBodyTypes() {
        super("Vehicle type by body");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleTypeByBodyTypes that = (VehicleTypeByBodyTypes) o;
        return attribute != null ? attribute.equals(that.attribute) : that.attribute == null;
    }
}
