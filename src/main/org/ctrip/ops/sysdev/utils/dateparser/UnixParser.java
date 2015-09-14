package org.ctrip.ops.sysdev.utils.dateparser;

import org.joda.time.DateTime;

public class UnixParser implements DateParser {

	@Override
	public DateTime parse(String input) {
		return new DateTime(Double.parseDouble(input) * 1000);
	}

	public static void main(String[] args) {
		String input = "1433238542.48729";
		UnixParser p = new UnixParser();
		System.out.println(p.parse(input));
	}
}