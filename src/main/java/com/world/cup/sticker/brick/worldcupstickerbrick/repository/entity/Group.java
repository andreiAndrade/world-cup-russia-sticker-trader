package com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity;

import com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity.enums.Privacy;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * POJO that represents a group.
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
public class Group {

  private String name;
  private List<User> admin;
  private List<User> users;
  private Privacy privacy;
}
