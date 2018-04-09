package com.world.cup.sticker.brick.worldcupstickerbrick.repository.dao;

import com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity.Sticker;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StickerRepository extends MongoRepository<Sticker, Integer> {

}
