package com.serrodcal.poc.presentation.resource.payload.convertert;


import com.serrodcal.poc.application.command.CreateAccountCommand;
import com.serrodcal.poc.presentation.resource.payload.request.CreateAccountRequestPayload;

import java.util.Date;

public class CreateAccountRequestPayloadToCreateAccountCommandConverter {

    public CreateAccountRequestPayloadToCreateAccountCommandConverter() { }

    public CreateAccountCommand convert(CreateAccountRequestPayload source) {
        return new CreateAccountCommand(source.getAccountType(), source.getHolder(), source.getHolderBirthDate(), source.getAuthorized());
    }

}
