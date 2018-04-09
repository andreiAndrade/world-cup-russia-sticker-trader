package com.world.cup.sticker.brick.worldcupstickerbrick.repository.entity.enums;

import lombok.Getter;
import lombok.ToString;

/**
 * Enum that represents the status of a trade.
 *
 * @author gabriel.beck.santos@gmail.com
 * @since 07/04/18
 */
@ToString
@Getter
public enum TradeStatus {
  PENDING,
  ACCEPTED,
  CLOSED;
}
