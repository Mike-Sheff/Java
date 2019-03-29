package Netologia.task_2_2.task_2_2_3;

import java.util.List;

public class AdsService {
    private List<VehicleAd> adList;

    public void setAdList(List<VehicleAd> adList) {
        this.adList = adList;
    }

    public void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleType) {
        for (VehicleAd ad : adList) {
            try {
                if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                    System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                            + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
                } else {
                    System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " + vehicleType.getTypeName() + ", критерий- " +
                            vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                            ad.getVehicleTypeByPurpose().getTypeName());
                }
            }
            catch (NullPointerException exp)
            {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто, кузова или топлива - не задан");
            }
        }
    }

    public void filterByVehicleTypeByBodyTypes(VehicleTypeByBodyTypes vehicleType) {
        for (VehicleAd ad : adList) {
            try {
                if (ad.getVehicleTypeByBodyTypes().equals(vehicleType)) {
                    System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                            + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
                } else {
                    System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " +
                            vehicleType.getTypeName() + ", критерий- " +
                            vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                            ad.getVehicleTypeByBodyTypes().getTypeName());
                }
            }
            catch (NullPointerException exp)
            {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто, кузова или топлива - не задан" );

            }
        }
    }

    public void filterByVehicleTypeByFuelTypes(VehicleTypeByFuelTypes vehicleType) {
        for (VehicleAd ad : adList) {
            try {
                if (ad.getVehicleTypeByFuelTypes().equals(vehicleType)) {
                    System.out.println("Объявление № " + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                            + vehicleType.getTypeName() + ", атрибут фильтра " + vehicleType.getAttributeOfType());
                } else {
                    System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто - " +
                            vehicleType.getTypeName() + ", критерий- " +
                            vehicleType.getAttributeOfType() + ", так как имеет тип авто " +
                            ad.getVehicleTypeByFuelTypes().getTypeName());
                }
            } catch (NullPointerException exp) {
                System.out.println("Объявление № " + ad.getId() + " не прошло фильтр: тип авто, кузова или топлива - не задан");

            }
        }
    }

}
