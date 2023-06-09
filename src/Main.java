import type.body.PickupType;
import type.body.SedanType;
import type.fuel.DieselType;
import type.fuel.PetrolType;
import type.purpose.CarType;
import type.purpose.TruckType;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd suzukiAd = new VehicleAd("Suzuki", "777", new CarType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(), new PickupType(), new DieselType());

        adsService.setAdList(new VehicleAd[] {suzukiAd, kamazAd});
        adsService.filterByVehicleTypeByPurpose(new CarType());
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
        adsService.filterByVehicleTypeByBodyTypes(new SedanType());
    }
}
