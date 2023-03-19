package type.body;

import type.VehicleTypeEnum;
import type.body.VehicleTypeByBodyTypes;

public class BusType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
