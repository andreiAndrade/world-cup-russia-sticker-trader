package com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity.enums;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Enum that represents the status of a trade.
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
public enum TradeStatus {
  PENDING,
  ACCEPTED,
  CLOSED;
}
