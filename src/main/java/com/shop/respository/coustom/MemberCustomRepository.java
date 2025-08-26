package com.shop.respository.coustom;

import com.shop.entity.Member;

import java.util.List;

public interface MemberCustomRepository {
    
    List<Member> findMemberNames(String name);
}
