package com.ps.constants;

public enum PsTestAdminConstants {
	BASE_URL("http://staging.ps-app-administration.apps.outfittery.de");

	private PsTestAdminConstants(String value) {
		this.value = value;
	}

	private String value;

	public String getValue() {
		return value;
	}
}
