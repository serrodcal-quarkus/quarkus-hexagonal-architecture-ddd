package com.serrodcal.presentation.resource.payload.convertert;

import com.serrodcal.application.dto.TransactionResultDTO;
import com.serrodcal.presentation.resource.payload.response.TransactionResultResponsePayload;

public class TransactionResultDTOToTransactionResultResponsePayloadConverter {

    public TransactionResultResponsePayload convert(TransactionResultDTO source) {
        return new TransactionResultResponsePayload(source.getResult(), source.getBalance(), source.getCurrency());
    }

}
