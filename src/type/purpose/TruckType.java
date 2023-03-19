package type.purpose;

import type.VehicleTypeEnum;
import type.purpose.VehicleTypeByPurpose;

public class TruckType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }


}
