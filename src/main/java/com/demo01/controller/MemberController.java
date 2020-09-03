package com.demo01.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo01.store.h2.MemberService;
import com.demo01.store.h2.model.Member;

@RestController
public class MemberController {
	@Value("${spring.application.name}")
	private String appName;
	//< MemberServiceImpl.java의 @Service annotation의 value값으로 정의한 이름을 설정
	@Resource(name = "memberServiceImpl")
	private MemberService memberService;
	
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	public String getName() {
		String name = appName;
		
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
