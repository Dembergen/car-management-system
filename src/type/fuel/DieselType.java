package type.fuel;

import type.VehicleTypeEnum;
import type.fuel.VehicleTypeByFuelTypes;

public class DieselType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
