package com.serrodcal.poc.presentation.resource.payload.convertert;

import com.serrodcal.poc.application.dto.AccountInformationDTO;
import com.serrodcal.poc.presentation.resource.payload.response.AccountFoundResponsePayload;

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
