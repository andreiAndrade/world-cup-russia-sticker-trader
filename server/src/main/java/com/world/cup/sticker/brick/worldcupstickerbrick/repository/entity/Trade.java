package com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity;

import com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity.enums.TradeStatus;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * POJO that represents a Trade between two {@link Trader}.
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
public class Trade {

  private Trader traderA;
  private Trader traderB;
  private TradeStatus status;
}
