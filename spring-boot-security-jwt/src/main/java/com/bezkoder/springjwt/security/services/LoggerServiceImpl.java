package com.bezkoder.springjwt.security.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.springjwt.models.LoggerInfo;
import com.bezkoder.springjwt.models.User;
import com.bezkoder.springjwt.repository.LoggerRepository;
import com.bezkoder.springjwt.repository.UserRepository;

@Service
public class LoggerServiceImpl {}
