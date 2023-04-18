package SU20366901.foundation.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SU20366901.foundation.bank.entity.AccountEntity;

@Repository
public interface AccountRepo extends JpaRepository<AccountEntity, Integer>{
	public AccountEntity findByAccountNumber(String accountNumber);
}
