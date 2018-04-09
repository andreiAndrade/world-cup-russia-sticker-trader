package com.world.cup.sticker.brick.worldcupstickerbrick.configuration;

import com.world.cup.sticker.brick.worldcupstickerbrick.repository.dao.StickerRepository;
import com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity.Sticker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:andrei.andrade@ntconsult.com.br">andrei.andrade</a>
 * @since 09/04/2018 13:12:00
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    StickerRepository stickerRepository;

    @Override
    public void run(String... args) throws Exception {
        stickerRepository.deleteAll();

        // save a couple of customers
        stickerRepository.saveAll(findSticker());

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Sticker sticker : stickerRepository.findAll()) {
            System.out.println(sticker);
        }
        System.out.println();
    }

    private List<Sticker> findSticker() throws IOException {
        Path path = Paths.get("stickers-code");
        List<String> lines = Files.readAllLines(path);

        List<Sticker> collect = new ArrayList<>();

        String group = null;

        for (String line : lines) {

            Integer number = null;
            String name = null;

            if (!line.trim().isEmpty()) {
                if (!line.trim().matches("([0-9]).*")) {
                    group = line.trim();
                } else {
                    String[] split = line.split("-");
                    number = Integer.parseInt(split[0].trim());
                    name = split[1].trim();

                    collect.add(new Sticker(number, name, group));
                }
            }


        }

        return collect;
    }
}
