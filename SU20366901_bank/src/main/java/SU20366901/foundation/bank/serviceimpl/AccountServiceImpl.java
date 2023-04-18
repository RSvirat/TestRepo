package SU20366901.foundation.bank.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.naming.InsufficientResourcesException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import SU20366901.foundation.bank.entity.AccountEntity;
import SU20366901.foundation.bank.entity.TranscationAccountEntity;
import SU20366901.foundation.bank.exception.ResourceNotFoundException;
import SU20366901.foundation.bank.repo.AccountRepo;
import SU20366901.foundation.bank.request.AccountRequest;
import SU20366901.foundation.bank.request.Transcation;
import SU20366901.foundation.bank.response.Response;
import SU20366901.foundation.bank.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountRepo;

	@Override
	public AccountEntity createAccount(AccountRequest accountRequest) throws ResourceNotFoundException {
		AccountEntity account = accountRepo.findByAccountNumber(accountRequest.getAccountNumber());
		if (ObjectUtils.isEmpty(account)) {
			AccountEntity accountEntity = new AccountEntity();
			accountEntity.setAccountIfcs(accountRequest.getAccountIfcs());
			accountEntity.setAccountMobile(accountRequest.getAccountMobile());
			accountEntity.setAccountName(accountRequest.getAccountName());
			accountEntity.setAccountNumber(accountRequest.getAccountNumber());
			accountEntity.setAccountType(accountRequest.getAccountType());
			accountEntity.setAccountBalance(accountRequest.getAccountBalance());
			accountRepo.save(accountEntity);
			return accountEntity;
		} else {
			throw new ResourceNotFoundException(accountRequest.getAccountNumber() + " Not Found");
		}

	}

	@Override
	public AccountEntity updateAccount(int id, AccountRequest accountRequest) throws ResourceNotFoundException {
		AccountEntity accountEntity = accountRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id +" Not Found"));
		accountEntity.setAccountType(accountRequest.getAccountType());
		accountEntity.setAccountMobile(accountRequest.getAccountMobile());
		accountEntity.setAccountIfcs(accountRequest.getAccountIfcs());
		accountEntity.setAccountName(accountRequest.getAccountName());
		accountEntity.setAccountBalance(accountEntity.getAccountBalance()+accountRequest.getAccountBalance());
		return accountRepo.save(accountEntity);
	}

	@Override
	public AccountEntity amountTranscation(AccountRequest accountRequest)
			throws ResourceNotFoundException, InsufficientResourcesException {
		
		AccountEntity account = accountRepo.findByAccountNumber(accountRequest.getAccountNumber());
		
		if(!ObjectUtils.isEmpty(account)) {
			double sum = 0;
			List<TranscationAccountEntity> listEntity = new ArrayList<>();
			for(Transcation list : accountRequest.getTranscation()) {
				TranscationAccountEntity transcationEntity = new TranscationAccountEntity();
				transcationEntity.setTranscationAccountNumber(list.getTranscationAccountNumber());
				transcationEntity.setTranscationAmount(list.getTranscationAmount());
				transcationEntity.setTranscationId(list.getTranscationId());
				transcationEntity.setTranscationIfcsNumber(list.getTranscationIfcsNumber());
				sum = sum + list.getTranscationAmount();
				listEntity.add(transcationEntity);
			}
			if(sum < account.getAccountBalance()) {
				account.setAccountBalance(account.getAccountBalance() - sum);
				account.setTranscationAccount(listEntity);
				return accountRepo.save(account);
			} else {
				throw new InsufficientResourcesException(accountRequest.getAccountBalance() + " Insuffient Balance");
			}
		} else {
			throw new ResourceNotFoundException(accountRequest.getAccountNumber() + " Not Found");
		}
		
	}

	@Override
	public List<AccountEntity> getAllAccount() throws ResourceNotFoundException {
		List<AccountEntity> accountEntity = accountRepo.findAll();
		if(!accountEntity.isEmpty()) {
			return accountEntity;
		} else {
			throw new ResourceNotFoundException("Record Not Found");
		}
	}

	@Override
	public AccountEntity getAccountById(int id) throws ResourceNotFoundException {
		AccountEntity accountEntity = accountRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + " Not Found"));
		return accountEntity;
	}

	@Override
	public Response deleteAccound(int id) throws ResourceNotFoundException {
		AccountEntity accountEntity = accountRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + " not found"));
		accountRepo.delete(accountEntity);
		Response response = new Response();
		response.setMessage("Record Deleted");
		return response;
	}
}
