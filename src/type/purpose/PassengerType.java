package type.purpose;

import type.VehicleTypeEnum;
import type.purpose.VehicleTypeByPurpose;

public class PassengerType extends VehicleTypeByPurpose {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }

}
