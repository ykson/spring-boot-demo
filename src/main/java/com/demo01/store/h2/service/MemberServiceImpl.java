package com.demo01.store.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo01.store.h2.MemberService;
import com.demo01.store.h2.model.Member;
import com.demo01.store.h2.repository.MemberRepository;

@Service(value = "memberServiceImpl")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberRepository memberRepository;
	
	////////////////////////////////////////////////////////////////////////////////
	//< constructors
	
	////////////////////////////////////////////////////////////////////////////////
	//< public functions
	

	@Override
	public Member add(Member member) throws Exception {
		return memberRepository.save(member);
	}

	@Override
	public List<Member> getAll() throws Exception {
		return memberRepository.findAll();
	}

	@Override
	public void deleteAll() throws Exception {
		memberRepository.deleteAll();
	}
	
	////////////////////////////////////////////////////////////////////////////////
	//< private functions
}
