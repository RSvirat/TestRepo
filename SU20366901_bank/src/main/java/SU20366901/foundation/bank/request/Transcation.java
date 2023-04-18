package SU20366901.foundation.bank.request;

import lombok.Data;

@Data
public class Transcation {

	private int transcationId;
	private String transcationAccountNumber;
	private String transcationIfcsNumber;
	private double transcationAmount;
}
