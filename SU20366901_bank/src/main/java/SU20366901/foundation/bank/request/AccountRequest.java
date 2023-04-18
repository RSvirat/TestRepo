package SU20366901.foundation.bank.request;

import java.util.List;

import lombok.Data;

@Data
public class AccountRequest {
	private int id;
	private String accountNumber;
	private String accountName;
	private String accountMobile;
	private String accountIfcs;
	private String accountType;
	private double accountBalance;
	private List<Transcation> transcation; 
}
