package SU20366901.foundation.bank.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name = "accountDetails")
public class AccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String accountNumber;
	private String accountName;
	private String accountMobile;
	private String accountIfcs;
	private String accountType;
	private double accountBalance;
	
	@OneToMany(targetEntity = TranscationAccountEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "id")
	private List<TranscationAccountEntity> transcationAccount;

}
