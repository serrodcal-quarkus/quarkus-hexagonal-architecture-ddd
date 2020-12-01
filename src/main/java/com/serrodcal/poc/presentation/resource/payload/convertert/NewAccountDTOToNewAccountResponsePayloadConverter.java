package com.serrodcal.poc.presentation.resource.payload.convertert;

import com.serrodcal.poc.application.dto.NewAccountDTO;
import com.serrodcal.poc.presentation.resource.payload.response.NewAccountResponsePayload;

public class NewAccountDTOToNewAccountResponsePayloadConverter {

    public NewAccountResponsePayload convert(NewAccountDTO source) {
        return new NewAccountResponsePayload(source.getUuid(), source.getIban());
    }

}
