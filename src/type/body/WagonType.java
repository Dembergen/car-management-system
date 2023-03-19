package type.body;

import type.VehicleTypeEnum;
import type.body.VehicleTypeByBodyTypes;

public class WagonType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
