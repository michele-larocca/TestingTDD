package it.softeco.training;

import javax.inject.Inject;

import org.apache.commons.lang3.math.NumberUtils;

import it.softeco.training.date.utils.DateUtilsInterface;

public class YearUtils {
	
	@Inject DateUtilsInterface dateUtils;
	
	public Boolean isLeapYear(final int year) {
		if(year < 0) throw new IllegalArgumentException("year should be not negative");
		
		return isDivisible(year, 4) && (!isDivisible(year, 100) || isDivisible(year, 400));
	}

	private boolean isDivisible(final int year, final int denominator) {
		return year % denominator == 0;
	}

	public int getDifferenceBetweenSysdate(final int year) {
		return NumberUtils.max(0, year - dateUtils.getYearSysDate());
	}

}
