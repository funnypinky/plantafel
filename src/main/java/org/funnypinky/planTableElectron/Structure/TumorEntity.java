package org.funnypinky.planTableElectron.Structure;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity (name="TUMORENTITY")
@Data
public class TumorEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Setter
    private String name;

    public TumorEntity(String name) {
        this.name = name;
    }

    public TumorEntity(){};
}
