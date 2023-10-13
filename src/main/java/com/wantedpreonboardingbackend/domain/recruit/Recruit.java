package com.wantedpreonboardingbackend.domain.recruit;

import com.wantedpreonboardingbackend.domain.apply.Apply;
import com.wantedpreonboardingbackend.domain.company.Company;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Recruit {

    @Id
    @GeneratedValue
    @Column(name = "recruit_id")
    private Long id;

    @OneToMany(mappedBy = "recruit")
    private List<Apply> applies = new ArrayList<Apply>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    private Long reward;

    private String position;

    private String description;

    private String skill;
}
