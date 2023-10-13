package com.wantedpreonboardingbackend.domain.company;

import com.wantedpreonboardingbackend.domain.recruit.Recruit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue
    @Column(name = "company_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "company")
    private List<Recruit> recruits = new ArrayList<Recruit>();

    private String nation;

    private String local;




}
