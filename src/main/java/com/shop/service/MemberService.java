package com.shop.service;

import com.shop.entity.Member;
import com.shop.respository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    
    public Long join(Member member) {
        validDuplicateMember(member);
        memberRepository.save(member);
        return member.getMemberId();
    }
    
    private void validDuplicateMember(Member member) {
        List<Member> memberNames = memberRepository.findMemberNames(member.getName());
        if (!memberNames.isEmpty()) {
            throw new RuntimeException("중복이름");
        }
    }
    
    public Member findOne(Long id) {
        return memberRepository.findById(id).orElseThrow(RuntimeException::new);
    }
    
    public List<Member> findAll() {
        return memberRepository.findAll();
    }
}
