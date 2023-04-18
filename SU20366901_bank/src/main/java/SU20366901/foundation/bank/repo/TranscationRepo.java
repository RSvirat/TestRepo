package SU20366901.foundation.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import SU20366901.foundation.bank.entity.TranscationAccountEntity;

public interface TranscationRepo extends JpaRepository<TranscationAccountEntity, Integer>{

}
