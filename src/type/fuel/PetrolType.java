package type.fuel;

import type.VehicleTypeEnum;
import type.fuel.VehicleTypeByFuelTypes;

public class PetrolType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
