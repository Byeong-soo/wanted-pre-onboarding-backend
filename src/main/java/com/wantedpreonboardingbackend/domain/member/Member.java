package com.wantedpreonboardingbackend.domain.member;

import com.wantedpreonboardingbackend.domain.apply.Apply;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "member")
    private List<Apply> applies = new ArrayList<Apply>();
}
