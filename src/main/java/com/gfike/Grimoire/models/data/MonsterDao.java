package com.gfike.Grimoire.models.data;

import com.gfike.Grimoire.models.Monster;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface MonsterDao extends CrudRepository<Monster, Integer> {


}
