package Netologia.task_2_2.task_2_2_3;

public class VehicleTypeByPurpose extends VehicleType {
    public VehicleTypeByPurpose() {
        super("Vehicle type by purpose");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) o;
        return attribute != null ? attribute.equals(that.attribute) : that.attribute == null;
    }
}
