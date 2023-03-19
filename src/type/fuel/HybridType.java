package type.fuel;

import type.VehicleTypeEnum;
import type.fuel.VehicleTypeByFuelTypes;

public class HybridType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
