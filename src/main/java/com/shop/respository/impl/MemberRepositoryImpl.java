package com.shop.respository.impl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.shop.entity.Member;
import com.shop.respository.coustom.MemberCustomRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.shop.entity.QMember.member;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberCustomRepository {
    
    
    private final JPAQueryFactory queryFactory;
    
    @Override
    public List<Member> findMemberNames(String name) {
        return queryFactory
                .selectFrom(member)
                .where(member.name.eq(name))
                .fetch();
    }
}
