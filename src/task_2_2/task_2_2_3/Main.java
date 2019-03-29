package Netologia.task_2_2.task_2_2_3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задача:  Иерархия “Автомобили”.");
        System.out.println("");

        AdsService adsService = new AdsService();

        ArrayList<VehicleAd> ad = new ArrayList<VehicleAd>();

        ad.add(new VehicleAd("Volvo", "123", new PassengerType(), null, null));
        ad.add(new VehicleAd("Kamaz", "45", new TruckType(), null, null));
        ad.add(new VehicleAd("Avto1", "76", null, new WagonType(), new HybridType()));
        ad.add(new VehicleAd("Avto2", "548", null, null, null));
        ad.add(new VehicleAd("Avto3", "7898", new CarType(), new SedanType(), new PetrolType()));

        for(int i=0; i < ad.size();i++) {
            adsService.setAdList(Arrays.asList(ad.get(i)));

            adsService.filterByVehicleTypeByPurpose(new PassengerType());
            adsService.filterByVehicleTypeByPurpose(new TruckType());
            adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
            adsService.filterByVehicleTypeByFuelTypes(new ElectricType());
            adsService.filterByVehicleTypeByBodyTypes(new PickupType());
            adsService.filterByVehicleTypeByBodyTypes(new SedanType());

            System.out.println("");

        }

        System.out.println("");
        System.out.println("До свидания!");
    }
}
