package com.serrodcal.poc.presentation.resource;

import com.serrodcal.poc.application.service.TransactionsService;
import com.serrodcal.poc.presentation.resource.payload.request.MakeTransactionRequestPayload;
import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Route;
import io.quarkus.vertx.web.RouteBase;
import io.vertx.core.http.HttpMethod;
import io.vertx.reactivex.ext.web.RoutingContext;

import javax.inject.Inject;

@RouteBase(path = "api/v1/account")
public class TransactionsResource {

    @Inject
    TransactionsService transactionsService;

    @Route(path = "transaction", methods = HttpMethod.POST)
    void makeTransaction(RoutingContext rc, @Body MakeTransactionRequestPayload payload) {
        rc.response().end(payload.toString());
    }

}
