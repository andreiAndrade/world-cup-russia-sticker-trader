package com.world.cup.sticker.brick.worldcupstickerbrick.repository.dao;

import com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity.Group;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Repository of {@link GroupRepository}.
 *
 * @author gabriel.beck.santos@gmail.com
 * @since 07/04/18
 */
public interface GroupRepository extends MongoRepository<Group, String> {

}
