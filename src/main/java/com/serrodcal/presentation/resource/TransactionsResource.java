package com.serrodcal.presentation.resource;

import com.serrodcal.application.service.TransactionsService;
import com.serrodcal.presentation.resource.payload.request.MakeTransactionRequestPayload;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.core.http.HttpMethod;
import io.vertx.reactivex.ext.web.RoutingContext;

import javax.inject.Inject;
import javax.validation.Valid;

@RouteBase(path = "api/v1/account")
public class TransactionsResource {

    @Inject
    TransactionsService transactionsService;

    @Route(path = "transaction", methods = HttpMethod.POST)
    void makeTransaction(RoutingContext rc, @Body @Valid MakeTransactionRequestPayload payload) {
        rc.response().end(payload.toString());
    }

}
