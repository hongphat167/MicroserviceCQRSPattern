package com.hongphat.bookservice.module.entity;

import com.hongphat.common_service.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * The type Book entity.
 *
 * @author hongp
 * @createDay 05 /01/2025
 * @description Happy Coding With Phat 😊😊
 */
@Entity
@Table(name = "BOOK")
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class BookEntity extends BaseEntity {

	@Column(name = "NAME")
	private String name;

	@Column(name = "AUTHOR")
	private String author;

	@Column(name = "IS_READY")
	private Boolean isReady;
}
