package com.serrodcal.presentation.resource.payload.convertert;

import com.serrodcal.application.command.MakeTransactionCommand;
import com.serrodcal.presentation.resource.payload.request.MakeTransactionRequestPayload;

public class MakeTransactionRequestPayloadToMakeTransactionCommandConverter {

    public MakeTransactionRequestPayloadToMakeTransactionCommandConverter() { }

    public MakeTransactionCommand convert(MakeTransactionRequestPayload source) {
        return new MakeTransactionCommand(
                source.getAccount(),
                source.getDescription(),
                source.getAmount(),
                source.getCurrency(),
                source.getDate()
        );
    }

}
