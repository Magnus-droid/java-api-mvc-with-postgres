package com.booleanuk.api.employees;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Employee {
    @Setter
    private long id;

    @Getter
    private String name;

    @Getter
    private String jobName;

    @Getter
    private String salaryGrade;

    @Getter
    private String department;
}
