package com.serrodcal.presentation.resource.payload.convertert;

import com.serrodcal.application.dto.AccountInformationDTO;
import com.serrodcal.presentation.resource.payload.response.AccountFoundResponsePayload;

public class AccountInformationDTOToAccountFoundResponsePayloadConverter {

    public AccountFoundResponsePayload convert(AccountInformationDTO source) {
        return new AccountFoundResponsePayload(
                source.getUuid(),
                source.getIban(),
                source.getType(),
                source.getBalance(),
                source.getCurrency()
        );
    }

}
