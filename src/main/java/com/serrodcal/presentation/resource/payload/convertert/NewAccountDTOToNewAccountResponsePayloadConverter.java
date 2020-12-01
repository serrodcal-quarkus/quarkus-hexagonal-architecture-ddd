package com.serrodcal.presentation.resource.payload.convertert;

import com.serrodcal.application.dto.NewAccountDTO;
import com.serrodcal.presentation.resource.payload.response.NewAccountResponsePayload;

public class NewAccountDTOToNewAccountResponsePayloadConverter {

    public NewAccountResponsePayload convert(NewAccountDTO source) {
        return new NewAccountResponsePayload(source.getUuid(), source.getIban());
    }

}
