package com.simtlix.consultafijapoc.account;

import com.simtlix.consultafijapoc.account.controller.AccountController;
import com.simtlix.consultafijapoc.account.model.Account;
import com.simtlix.consultafijapoc.account.model.builder.AccountBuilder;
import com.simtlix.consultafijapoc.account.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@WebMvcTest(AccountController.class)
public class AccountApplicationTests {

	@MockBean
	private AccountService service;

	@Autowired
	WebApplicationContext context;

	@Test
	public void whenGetAllAccounts_thenReturnJsonArray() {

		/*AccountBuilder builder = new AccountBuilder();
		builder.withDni(20000000).withNombre("alan").withApellido("perez");
		Account alan = builder.build();

		AccountBuilder builder1 = new AccountBuilder();
		builder.withDni(20000000).withNombre("maria").withApellido("gonzales");
		Account maria = builder1.build();

		List<Account> allAccounts = Arrays.asList(alan, maria);

		given(service.getAllAccounts()).willReturn(allAccounts);*/
	}

}
