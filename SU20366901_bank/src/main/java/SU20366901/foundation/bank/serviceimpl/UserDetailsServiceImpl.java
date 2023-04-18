package SU20366901.foundation.bank.serviceimpl;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if("sudhakar".equals(username)) {
			return new User("sudhakar","RSsujiYuva@1829",new ArrayList<>());
		}
		throw new UsernameNotFoundException("User not found with username: " + username);
	}

}
