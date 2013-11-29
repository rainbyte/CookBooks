package com.t3g.cookbooks.util;

public class FieldValidator {

	private FieldValidator() {
		// This class should not be instantiated.
	}

	public static boolean isAlpha(String input) {
		return input.matches("^[a-zA-Záíúéóü ]+$");
	}

	public static boolean isAlphanumeric(String input) {
		return input.matches("^[a-zA-Z0-9áíúéóü ]+$");
	}

	public static boolean isCreditCardCode(String input) {
		return input.matches("^[a-zA-Z0-9]{4}$");
	}

	public static boolean isCreditCardNumber(String input) {
		return input.matches("^[0-9]{16}$");
	}

	public static boolean isEmail(String input) {
		return input.matches("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z][a-zA-Z0-9]+\\.[a-zA-Z]{3,4}(\\.[a-zA-Z]{2}|)$");
	}

	public static boolean isNumberFloat(String input) {
		return input.matches("^[0-9]+(\\.[0-9]+|)$");
	}

	public static boolean isNumberInteger(String input) {
		return input.matches("^[0-9]+$");
	}

	public static boolean isPhone(String input) {
		return input.matches("^[0-9]{10,13}$");
	}

	public static boolean isIsbn(String input) {
		return input.matches("^[0-9-]{10,13}$");
	}

	public static boolean isImagePath(String input) {
		return input.matches("^[a-zA-Z0-9áíúéóü/\\\\,_-ñ@?¿:·%= ]+(.jpg|.jpeg|.png|.gif|.bpm)$");
	}

	public static void main(String[] args) {
		String alpha = "aiueo";
		String alphanumeric = "aiueo12345";
		String creditCardCode = "a1i2";
		String creditCardNumber = "1234123412341234";
		String email = "aiueo12345@dominio.com.ar";
		String numberFloat = "12345.12345";
		String numberInteger = "12345";
		String phone = "2216123123";

		System.out.printf("'%s' is alpha? %s\n", alpha, isAlpha(alpha));
		System.out.printf("'%s' is alpha? %s\n", alphanumeric, isAlpha(alphanumeric));
		System.out.printf("'%s' is alpha? %s\n", creditCardCode, isAlpha(creditCardCode));
		System.out.printf("'%s' is alpha? %s\n", creditCardNumber, isAlpha(creditCardNumber));
		System.out.printf("'%s' is alpha? %s\n", email, isAlpha(email));
		System.out.printf("'%s' is alpha? %s\n", numberFloat, isAlpha(numberFloat));
		System.out.printf("'%s' is alpha? %s\n", numberInteger, isAlpha(numberInteger));
		System.out.printf("'%s' is alpha? %s\n\n", phone, isAlpha(phone));
		
		System.out.printf("'%s' is alphanumeric? %s\n", alpha, isAlphanumeric(alpha));
		System.out.printf("'%s' is alphanumeric? %s\n", alphanumeric, isAlphanumeric(alphanumeric));
		System.out.printf("'%s' is alphanumeric? %s\n", creditCardCode, isAlphanumeric(creditCardCode));
		System.out.printf("'%s' is alphanumeric? %s\n", creditCardNumber, isAlphanumeric(creditCardNumber));
		System.out.printf("'%s' is alphanumeric? %s\n", email, isAlphanumeric(email));
		System.out.printf("'%s' is alphanumeric? %s\n", numberFloat, isAlphanumeric(numberFloat));
		System.out.printf("'%s' is alphanumeric? %s\n", numberInteger, isAlphanumeric(numberInteger));
		System.out.printf("'%s' is alphanumeric? %s\n\n", phone, isAlphanumeric(phone));

		System.out.printf("'%s' is credit card number? %s\n", alpha, isCreditCardNumber(alpha));
		System.out.printf("'%s' is credit card number? %s\n", alphanumeric, isCreditCardNumber(alphanumeric));
		System.out.printf("'%s' is credit card number? %s\n", creditCardCode, isCreditCardNumber(creditCardCode));
		System.out.printf("'%s' is credit card number? %s\n", creditCardNumber, isCreditCardNumber(creditCardNumber));
		System.out.printf("'%s' is credit card number? %s\n", email, isCreditCardNumber(email));
		System.out.printf("'%s' is credit card number? %s\n", numberFloat, isCreditCardNumber(numberFloat));
		System.out.printf("'%s' is credit card number? %s\n", numberInteger, isCreditCardNumber(numberInteger));
		System.out.printf("'%s' is credit card number? %s\n\n", phone, isCreditCardNumber(phone));

		System.out.printf("'%s' is credit card code? %s\n", alpha, isCreditCardCode(alpha));
		System.out.printf("'%s' is credit card code? %s\n", alphanumeric, isCreditCardCode(alphanumeric));
		System.out.printf("'%s' is credit card code? %s\n", creditCardCode, isCreditCardCode(creditCardCode));
		System.out.printf("'%s' is credit card code? %s\n", creditCardNumber, isCreditCardCode(creditCardNumber));
		System.out.printf("'%s' is credit card code? %s\n", email, isCreditCardCode(email));
		System.out.printf("'%s' is credit card code? %s\n", numberFloat, isCreditCardCode(numberFloat));
		System.out.printf("'%s' is credit card code? %s\n", numberInteger, isCreditCardCode(numberInteger));
		System.out.printf("'%s' is credit card code? %s\n\n", phone, isCreditCardCode(phone));

		System.out.printf("'%s' is email? %s\n", alpha, isEmail(alpha));
		System.out.printf("'%s' is email? %s\n", alphanumeric, isEmail(alphanumeric));
		System.out.printf("'%s' is email? %s\n", creditCardCode, isEmail(creditCardCode));
		System.out.printf("'%s' is email? %s\n", creditCardNumber, isEmail(creditCardNumber));
		System.out.printf("'%s' is email? %s\n", email, isEmail(email));
		System.out.printf("'%s' is email? %s\n", numberFloat, isEmail(numberFloat));
		System.out.printf("'%s' is email? %s\n", numberInteger, isEmail(numberInteger));
		System.out.printf("'%s' is email? %s\n\n", phone, isEmail(phone));

		System.out.printf("'%s' is float? %s\n", alpha, isNumberFloat(alpha));
		System.out.printf("'%s' is float? %s\n", alphanumeric, isNumberFloat(alphanumeric));
		System.out.printf("'%s' is float? %s\n", creditCardCode, isNumberFloat(creditCardCode));
		System.out.printf("'%s' is float? %s\n", creditCardNumber, isNumberFloat(creditCardNumber));
		System.out.printf("'%s' is float? %s\n", email, isNumberFloat(email));
		System.out.printf("'%s' is float? %s\n", numberFloat, isNumberFloat(numberFloat));
		System.out.printf("'%s' is float? %s\n", numberInteger, isNumberFloat(numberInteger));
		System.out.printf("'%s' is float? %s\n\n", phone, isNumberFloat(phone));

		System.out.printf("'%s' is integer? %s\n", alpha, isNumberInteger(alpha));
		System.out.printf("'%s' is integer? %s\n", alphanumeric, isNumberInteger(alphanumeric));
		System.out.printf("'%s' is integer? %s\n", creditCardCode, isNumberInteger(creditCardCode));
		System.out.printf("'%s' is integer? %s\n", creditCardNumber, isNumberInteger(creditCardNumber));
		System.out.printf("'%s' is integer? %s\n", email, isNumberInteger(email));
		System.out.printf("'%s' is integer? %s\n", numberFloat, isNumberInteger(numberFloat));
		System.out.printf("'%s' is integer? %s\n", numberInteger, isNumberInteger(numberInteger));
		System.out.printf("'%s' is integer? %s\n\n", phone, isNumberInteger(phone));

		System.out.printf("'%s' is phone? %s\n", alpha, isPhone(alpha));
		System.out.printf("'%s' is phone? %s\n", alphanumeric, isPhone(alphanumeric));
		System.out.printf("'%s' is phone? %s\n", creditCardCode, isPhone(creditCardCode));
		System.out.printf("'%s' is phone? %s\n", creditCardNumber, isPhone(creditCardNumber));
		System.out.printf("'%s' is phone? %s\n", email, isPhone(email));
		System.out.printf("'%s' is phone? %s\n", numberFloat, isPhone(numberFloat));
		System.out.printf("'%s' is phone? %s\n", numberInteger, isPhone(numberInteger));
		System.out.printf("'%s' is phone? %s\n\n", phone, isPhone(phone));
	}
}
