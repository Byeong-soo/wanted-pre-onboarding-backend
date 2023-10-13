package com.wantedpreonboardingbackend.domain.apply;

import com.wantedpreonboardingbackend.domain.member.Member;
import com.wantedpreonboardingbackend.domain.recruit.Recruit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "applies")
@Getter
@Setter
public class Apply {

    @Id
    @GeneratedValue
    @Column(name = "apply_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruit_id")
    private Recruit recruit;

    private LocalDateTime applyDate;

    @Enumerated(EnumType.STRING)
    private ApplyStatus status; //지원상태 [ RECEIPT, CHECK, FAILURE, PAPERPASS, PASS]

}
