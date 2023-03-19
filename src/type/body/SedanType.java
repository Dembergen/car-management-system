package type.body;

import type.VehicleTypeEnum;
import type.body.VehicleTypeByBodyTypes;

public class SedanType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
