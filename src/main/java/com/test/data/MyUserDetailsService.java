package com.test.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.test.data.customer.Customer;
import com.test.data.customer.CustomerRepository;
import com.test.data.exception.APIException;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private HttpSession httpSession;
	
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    	Customer customer = customerRepository.findByUsername(s).orElseThrow(() -> new APIException("username not found"));
    	httpSession.setAttribute("CUSTOMER_ID", customer.getId());
        return new User(customer.getUsername(), "", new ArrayList<>());
    }
}