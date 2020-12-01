package com.serrodcal.poc.presentation.resource.payload.convertert;

import com.serrodcal.poc.application.dto.BalanceAccountDTO;
import com.serrodcal.poc.presentation.resource.payload.response.AccountBalanceResponsePayload;

public class BalanceAccountDTOToAccountBalanceResponsePayloadConverter {

    public AccountBalanceResponsePayload convert(BalanceAccountDTO source) {
        return new AccountBalanceResponsePayload(source.getAmount(), source.getCurrency());
    }

}
