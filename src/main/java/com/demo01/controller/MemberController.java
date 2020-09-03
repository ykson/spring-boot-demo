package com.demo01.controller;

import com.demo01.domain.service.NameService;
import com.demo01.store.h2.MemberService;
import com.demo01.store.h2.model.Member;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MemberController {
	//< MemberServiceImpl.java의 @Service annotation의 value값으로 정의한 이름을 설정
	@Resource(name = "memberServiceImpl")
	private MemberService memberService;
	@Resource(name = "nameServiceImpl")
	private NameService nameService;
	
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public String getName() {
		String name = null;
		try {
			name = nameService.getName();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return name;
	}
	
	/**
	 * Add
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Member add(@RequestBody Member member) {
		Member addMember = null;
		
		try {
			addMember = memberService.add(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return addMember;
	}
	
	/**
	 * Get All
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Member> getAll() {
		try {
			return memberService.getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * Delete All
	 */
	@RequestMapping(value = "/deleteAll", method = RequestMethod.GET)
	public String deleteAll() {
		try {
			memberService.deleteAll();
			
			return "delete all!!";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "fail to delete ):";
	}
}
