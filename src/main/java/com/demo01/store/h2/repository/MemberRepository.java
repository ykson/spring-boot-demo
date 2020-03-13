package com.demo01.store.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo01.store.h2.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
