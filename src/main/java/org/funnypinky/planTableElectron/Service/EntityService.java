package org.funnypinky.planTableElectron.Service;

import org.funnypinky.planTableElectron.Repository.EntityRepository;
import org.funnypinky.planTableElectron.Structure.TumorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EntityService {
    @Autowired
    private EntityRepository entityRepository;

    public List<TumorEntity> list() {
        return entityRepository.findAll();
    }

    public void addEntity(String entity) {
        entityRepository.save(new TumorEntity(entity));
    }

    public void addEntities(String... entity) {
        List<TumorEntity> tumorEntities = new ArrayList<>();
        Arrays.stream(entity).parallel().forEach(item -> {
            tumorEntities.add(new TumorEntity(item));
        });
    entityRepository.saveAll(tumorEntities);
    }

    public List<TumorEntity> findAll() {
        return entityRepository.findAll();
    }
}
