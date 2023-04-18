package SU20366901.foundation.bank.service;

import java.util.List;

import javax.naming.InsufficientResourcesException;

import SU20366901.foundation.bank.entity.AccountEntity;
import SU20366901.foundation.bank.exception.ResourceNotFoundException;
import SU20366901.foundation.bank.request.AccountRequest;
import SU20366901.foundation.bank.response.Response;

public interface AccountService {

	public AccountEntity createAccount(AccountRequest accountRequest) throws ResourceNotFoundException;
	public AccountEntity updateAccount(int id, AccountRequest accountRequest) throws ResourceNotFoundException;
	public AccountEntity amountTranscation(AccountRequest accountRequest) throws ResourceNotFoundException, InsufficientResourcesException;
	public List<AccountEntity> getAllAccount() throws ResourceNotFoundException;
	public AccountEntity getAccountById(int id) throws ResourceNotFoundException;
	public Response deleteAccound(int id) throws ResourceNotFoundException;
}
