package type.body;

import type.VehicleTypeEnum;
import type.body.VehicleTypeByBodyTypes;

public class PickupType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
