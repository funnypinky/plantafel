package org.funnypinky.planTableElectron.Structure;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private long id;
    private String lastName;
    private String firstName;
    private LocalDate dateOfBirth;
    private List<Plan> planList = new ArrayList<>();
}
