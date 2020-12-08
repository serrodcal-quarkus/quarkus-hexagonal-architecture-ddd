package com.serrodcal.presentation.resource;

import com.serrodcal.application.command.CreateAccountCommand;
import com.serrodcal.application.dto.NewAccountDTO;
import com.serrodcal.application.service.AccountService;
import io.quarkus.test.common.http.TestHTTPEndpoint;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import io.smallrye.mutiny.Uni;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.mockito.ArgumentMatchers.any;
//import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@TestHTTPEndpoint(AccountResource.class)
public class AccountResourceTest {

    @InjectMock
    AccountService accountService;

    @Test
    public void testCreateAccountHappyPath() {
        Mockito.when(accountService.createAccount(any(CreateAccountCommand.class)))
                .thenReturn(Uni.createFrom()
                .item(new NewAccountDTO(UUID.randomUUID().toString(), "ES1212341234121234567890")));

        given().when().get("/account").then().statusCode(200);
        //.body(is("hello"));
    }

}
