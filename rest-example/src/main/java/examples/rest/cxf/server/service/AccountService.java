package examples.rest.cxf.server.service;

import examples.rest.cxf.server.model.Account;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Path("/accountservice/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AccountService {

    Map<String, Account> accounts = new HashMap<String, Account>();

    public void init() {

        Account newAccount1 = new Account();
        newAccount1.setId(1);
        newAccount1.setName("Alvin Reyes");

        Account newAccount2 = new Account();
        newAccount2.setId(2);
        newAccount2.setName("Rachelle Ann de Guzman Reyes");

        accounts.put("1", newAccount1);
        accounts.put("2", newAccount2);

    }

    public AccountService() {
        init();
    }

    @GET
    @Path("/accounts/{id}/")
    public Account getAccount(@PathParam("id") String id) {
        Account c = accounts.get(id);
        return c;
    }

    @POST
    @Path("/accounts/getall")
    public List getAllAccounts(Account account) {
        List accountList = new ArrayList();
        for (int i = 0; i <= accounts.size(); i++) {
            accountList.add((Account) accounts.get(i));
        }
        return accountList;
    }

}