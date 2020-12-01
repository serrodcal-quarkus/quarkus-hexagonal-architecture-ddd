package com.serrodcal.presentation.resource.payload.convertert;

import com.serrodcal.application.dto.BalanceAccountDTO;
import com.serrodcal.presentation.resource.payload.response.AccountBalanceResponsePayload;

public class BalanceAccountDTOToAccountBalanceResponsePayloadConverter {

    public AccountBalanceResponsePayload convert(BalanceAccountDTO source) {
        return new AccountBalanceResponsePayload(source.getAmount(), source.getCurrency());
    }

}
