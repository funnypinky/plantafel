package org.funnypinky.planTableElectron.Repository;

import org.funnypinky.planTableElectron.Structure.TumorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends JpaRepository<TumorEntity, Long> {
}
