package SU20366901.foundation.bank.controller;

import ch.qos.logback.classic.Logger;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.naming.InsufficientResourcesException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SU20366901.foundation.bank.entity.AccountEntity;
import SU20366901.foundation.bank.exception.ResourceNotFoundException;
import SU20366901.foundation.bank.request.AccountRequest;
import SU20366901.foundation.bank.response.Response;
import SU20366901.foundation.bank.service.AccountService;

@RestController
@RequestMapping("/Bank")
public class AccountController {

	private final static Logger logger = (Logger) LoggerFactory.getLogger(AccountController.class);

	@Autowired
	private AccountService accountService;

	@PostMapping("/createAccount")
	public AccountEntity createAccount(@RequestBody AccountRequest accountRequest) throws ResourceNotFoundException {
		logger.info("Bank Account Create Start");
		return accountService.createAccount(accountRequest);
	}

	@PutMapping("/updateAccount/{id}")
	public AccountEntity updateAccount(@PathVariable int id, @RequestBody AccountRequest accountRequest)
			throws ResourceNotFoundException {
		logger.info("Bank Account Update Start");
		return accountService.updateAccount(id, accountRequest);
	}

	@PostMapping("/amountTranscation")
	public AccountEntity amountTranscation(@RequestBody AccountRequest accountRequest)
			throws ResourceNotFoundException, InsufficientResourcesException {
		logger.info("Bank Account Transcation start");
		return accountService.amountTranscation(accountRequest);
	}

	@GetMapping("/getAllAccount")
	public Map<String, List<AccountEntity>> getAllAccount() throws ResourceNotFoundException {
		logger.info("fetch all the record");
		Map<String, List<AccountEntity>> map = new LinkedHashMap<String, List<AccountEntity>>();
		map.put("data", accountService.getAllAccount());
		return map;
	}

	@GetMapping("/getAccountById/{id}")
	public AccountEntity getAccountById(@PathVariable int id) throws ResourceNotFoundException {
		logger.info("fetch the record by id");
		return accountService.getAccountById(id);
	}

	@DeleteMapping("/deleteById/{id}")
	public Response deleteById(@PathVariable int id) throws ResourceNotFoundException {
		logger.info("delete record by id");
		return accountService.deleteAccound(id);
	}
}
