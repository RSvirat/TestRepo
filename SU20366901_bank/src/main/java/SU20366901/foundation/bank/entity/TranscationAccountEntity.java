package SU20366901.foundation.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "transcationAccount")
public class TranscationAccountEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int transcationId;
	private String transcationAccountNumber;
	private String transcationIfcsNumber;
	private double transcationAmount;
	
}
