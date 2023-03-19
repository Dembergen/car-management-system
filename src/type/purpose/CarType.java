package type.purpose;

import type.VehicleTypeEnum;
import type.purpose.VehicleTypeByPurpose;

public class CarType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
