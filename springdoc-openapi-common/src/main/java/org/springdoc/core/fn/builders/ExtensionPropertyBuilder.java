package org.springdoc.core.fn.builders;

import java.lang.annotation.Annotation;

import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;

/**
 * The type Extension property builder.
 */
public class ExtensionPropertyBuilder {

	/**
	 * The name of the property.
	 *
	 */
	private String name;

	/**
	 * The value of the property.
	 *
	 */
	private String value;

	/**
	 * If set to true, field `value` will be parsed and serialized as JSON/YAML
	 *
	 */
	private boolean parseValue;

	/**
	 * Instantiates a new Extension property builder.
	 */
	private ExtensionPropertyBuilder() {
	}

	/**
	 * An extension property extension property builder.
	 *
	 * @return the extension property builder
	 */
	public static ExtensionPropertyBuilder builder() {
		return new ExtensionPropertyBuilder();
	}

	/**
	 * Name extension property builder.
	 *
	 * @param name the name
	 * @return the extension property builder
	 */
	public ExtensionPropertyBuilder name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Value extension property builder.
	 *
	 * @param value the value
	 * @return the extension property builder
	 */
	public ExtensionPropertyBuilder value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Parse value extension property builder.
	 *
	 * @param parseValue the parse value
	 * @return the extension property builder
	 */
	public ExtensionPropertyBuilder parseValue(boolean parseValue) {
		this.parseValue = parseValue;
		return this;
	}

	/**
	 * Build extension property.
	 *
	 * @return the extension property
	 */
	public ExtensionProperty build() {
		ExtensionProperty extensionProperty = new ExtensionProperty() {
			@Override
			public Class<? extends Annotation> annotationType() {
				return null;
			}
			@Override
			public String name() {
				return name;
			}
			@Override
			public String value() {
				return value;
			}
			@Override
			public boolean parseValue() {
				return parseValue;
			}
		};
		return extensionProperty;
	}
}
