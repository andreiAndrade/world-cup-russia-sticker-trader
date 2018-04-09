package com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * POJO that represents a user.
 *
 * @author gabriel.beck.santos@gmail.com
 * @since 07/04/18
 */
@EqualsAndHashCode
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String name;
  private List<Sticker> myStickers;
  private List<Sticker> wantedStickers;
}
