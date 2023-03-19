package type.fuel;

import type.VehicleTypeEnum;
import type.fuel.VehicleTypeByFuelTypes;

public class ElectricType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
