package com.shop.respository;

import com.shop.entity.Member;
import com.shop.respository.coustom.MemberCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberCustomRepository {
}
