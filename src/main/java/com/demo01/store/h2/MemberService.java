package com.demo01.store.h2;

import java.util.List;

import com.demo01.store.h2.model.Member;

public interface MemberService {
	public Member add(Member member) throws Exception;
	public List<Member> getAll() throws Exception;
	public void deleteAll() throws Exception;
}
