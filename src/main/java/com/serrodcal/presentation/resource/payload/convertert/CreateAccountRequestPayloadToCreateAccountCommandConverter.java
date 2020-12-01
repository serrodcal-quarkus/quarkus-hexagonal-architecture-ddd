package com.serrodcal.presentation.resource.payload.convertert;


import com.serrodcal.application.command.CreateAccountCommand;
import com.serrodcal.presentation.resource.payload.request.CreateAccountRequestPayload;

public class CreateAccountRequestPayloadToCreateAccountCommandConverter {

    public CreateAccountRequestPayloadToCreateAccountCommandConverter() { }

    public CreateAccountCommand convert(CreateAccountRequestPayload source) {
        return new CreateAccountCommand(source.getAccountType(), source.getHolder(), source.getHolderBirthDate(), source.getAuthorized());
    }

}
