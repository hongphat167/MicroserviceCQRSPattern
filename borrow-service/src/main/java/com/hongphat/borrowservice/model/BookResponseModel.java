package com.hongphat.borrowservice.model;

import lombok.*;

/**
 * BookResponseModel
 *
 * @author hongp
 * @description Happy Coding With Phat 😊😊
 * @since 10:07 CH 14/01/2025
 */
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class BookResponseModel {
	private String id;
	private String name;
	private String author;
	private Boolean isReady;
}
