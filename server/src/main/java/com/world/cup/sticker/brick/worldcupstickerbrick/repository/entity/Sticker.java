package com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * POJO that represents a sticker.
 *
 * @author gabriel.beck.santos@gmail.com
 * @since 07/04/18
 */
@EqualsAndHashCode
@ToString
@Getter
@Setter
@NoArgsConstructor
public class Sticker {

  @Id
  private Integer number;
  private String name;
  private String group;

    public Sticker() {
    }

    public Sticker(Integer number, String name, String group) {
    this.number = number;
    this.name = name;
    this.group = group;
  }

    @Override
    public String toString() {
        return "Sticker{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
