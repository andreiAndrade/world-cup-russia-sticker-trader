package com.world.cup.sticker.brick.worldcupstickerbrick;

import com.world.cup.sticker.brick.worldcupstickerbrick.repository.dao.StickerRepository;
import com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity.Sticker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorldCupStickerBrickApplication implements CommandLineRunner {

  @Autowired
  private StickerRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(WorldCupStickerBrickApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    repository.deleteAll();

    // save a couple of customers
    repository.save(new Sticker(0, "Panini Knight Logo", "Especiais"));
    repository.save(new Sticker(1, "FIFA Logo", "Especiais"));
    repository.save(new Sticker(2, "FIFA Logo", "Especiais"));

    // fetch all customers
    System.out.println("Customers found with findAll():");
    System.out.println("-------------------------------");
    for (Sticker customer : repository.findAll()) {
      System.out.println(customer);
    }
    System.out.println();

//    // fetch an individual customer
//    System.out.println("Customer found with findByFirstName('Alice'):");
//    System.out.println("--------------------------------");
//    System.out.println(repository.findByFirstName("Alice"));
//
//    System.out.println("Customers found with findByLastName('Smith'):");
//    System.out.println("--------------------------------");
//    for (Customer customer : repository.findByLastName("Smith")) {
//      System.out.println(customer);
//    }

  }

}
