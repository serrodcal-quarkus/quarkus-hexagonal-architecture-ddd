package com.serrodcal.presentation.resource;

import com.serrodcal.application.query.FindAccountQuery;
import com.serrodcal.application.query.GetBalanceQuery;
import com.serrodcal.application.service.AccountService;
import com.serrodcal.presentation.resource.payload.convertert.AccountInformationDTOToAccountFoundResponsePayloadConverter;
import com.serrodcal.presentation.resource.payload.convertert.BalanceAccountDTOToAccountBalanceResponsePayloadConverter;
import com.serrodcal.presentation.resource.payload.convertert.CreateAccountRequestPayloadToCreateAccountCommandConverter;
import com.serrodcal.presentation.resource.payload.convertert.NewAccountDTOToNewAccountResponsePayloadConverter;
import com.serrodcal.presentation.resource.payload.request.CreateAccountRequestPayload;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Param;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.core.http.HttpHeaders;
import io.vertx.core.http.HttpMethod;
import io.vertx.core.json.Json;
import io.vertx.reactivex.ext.web.RoutingContext;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Singleton
@RouteBase(path = "api/v1")
public class AccountResource {

    private static final Logger log = Logger.getLogger(AccountResource.class);

    @Inject
    AccountService accountService;

    @Route(path = "account", methods = HttpMethod.POST)
    void createAccount(RoutingContext rc, @Body @Valid CreateAccountRequestPayload payload) {
        log.debug("AccountResource.createAccount(): " + payload.toString());
        CreateAccountRequestPayloadToCreateAccountCommandConverter converterIn =
                new CreateAccountRequestPayloadToCreateAccountCommandConverter();
        this.accountService.createAccount(converterIn.convert(payload)).subscribe().with(
                result -> {
                    NewAccountDTOToNewAccountResponsePayloadConverter converterOut =
                            new NewAccountDTOToNewAccountResponsePayloadConverter();
                    rc.response()
                            .putHeader(HttpHeaders.CONTENT_TYPE, HttpHeaderValues.APPLICATION_JSON)
                            .end(Json.encode(converterOut.convert(result)));
                }
                , failure -> {
                    log.error("AccountResource.createAccount(): " + failure.getMessage());
                    rc.response()
                      .putHeader(HttpHeaders.CONTENT_TYPE, HttpHeaderValues.TEXT_PLAIN)
                      .setStatusCode(HttpResponseStatus.INTERNAL_SERVER_ERROR.code())
                      .end(failure.getMessage());
                }
        );
    }

    @Route(path = "account/:uuid", methods = HttpMethod.GET)
    void findAccount(RoutingContext rc, @NotNull @Param("uuid") String uuid) {
        log.debug("AccountResource.findAccount(): " + uuid);
        this.accountService.findAccount(new FindAccountQuery(uuid)).subscribe().with(
                result -> {
                    AccountInformationDTOToAccountFoundResponsePayloadConverter converterOut =
                            new AccountInformationDTOToAccountFoundResponsePayloadConverter();
                    rc.response()
                      .putHeader(HttpHeaders.CONTENT_TYPE, HttpHeaderValues.APPLICATION_JSON)
                      .end(Json.encode(converterOut.convert(result)));
                }
                , failure -> {
                    log.error("AccountResource.findAccount(): " + failure.getMessage());
                    rc.response()
                      .putHeader(HttpHeaders.CONTENT_TYPE, HttpHeaderValues.TEXT_PLAIN)
                      .setStatusCode(HttpResponseStatus.INTERNAL_SERVER_ERROR.code())
                      .end(failure.getMessage());
                }
        );
    }

    @Route(path = "account/:uuid/balance", methods = HttpMethod.GET)
    void getBalanceByUUID(RoutingContext rc, @NotNull @Param("uuid") String uuid) {
        log.debug("AccountResource.getBalanceByUUID(): " + uuid);
        this.accountService.getBalanceByUUID(new GetBalanceQuery(uuid)).subscribe().with(
                result -> {
                    BalanceAccountDTOToAccountBalanceResponsePayloadConverter converterOut =
                            new BalanceAccountDTOToAccountBalanceResponsePayloadConverter();
                    rc.response()
                      .putHeader(HttpHeaders.CONTENT_TYPE, HttpHeaderValues.APPLICATION_JSON)
                      .end(Json.encode(converterOut.convert(result)));
                }
                , failure -> {
                    log.error("AccountResource.getBalanceByUUID(): " + failure.getMessage());
                    rc.response()
                            .putHeader(HttpHeaders.CONTENT_TYPE, HttpHeaderValues.TEXT_PLAIN)
                            .setStatusCode(HttpResponseStatus.INTERNAL_SERVER_ERROR.code())
                            .end(failure.getMessage());
                }
        );
    }

}
