package SU20366901.foundation.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SU20366901.foundation.bank.config.JwtTokenUtil;
import SU20366901.foundation.bank.request.UserDetailsRequest;
import SU20366901.foundation.bank.response.JwtResponse;
import SU20366901.foundation.bank.serviceimpl.UserDetailsServiceImpl;

@RestController
public class JwtAuthenticationController {
	
	@Autowired
	private AuthenticationManager authiAuthenticationManager;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;
	
	@PostMapping("/authenicate")
	public ResponseEntity<?> createAutheniticationToken(@RequestBody UserDetailsRequest userDetailsRequest) throws Exception {
		
		final UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(userDetailsRequest.getUsername());
		//authenticate(userDetailsRequest.getUsername(), userDetailsRequest.getPassword());
		final String token = jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(new JwtResponse(token));	
	}
	
	private void authenticate(String username , String password) throws Exception {
		try {
			authiAuthenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password)); 
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			e.printStackTrace();
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}