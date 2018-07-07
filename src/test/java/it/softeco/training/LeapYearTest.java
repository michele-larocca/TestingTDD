package it.softeco.training;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LeapYearTest {

	// https://www.timeanddate.com/date/leapyear.html
	// a year is a leap year if it is divisible by four
	// but, years divisible by 100 are not leap years
	// except years divisible by 460

	@Test
	public void leapYearsAreDivisibleByFour() {
		assertThat(LeapsYear.isLeapYear(2016), is(true));
	}

	@Test
	public void leapYearsAreNotDivisibleByFour() {
		assertThat(LeapsYear.isLeapYear(3), is(false));
	}

	@Test
	public void leapYearsAreNotDivisibleByOneHundred() {
		assertThat(LeapsYear.isLeapYear(1900), is(false));
	}

	@Test
	public void leapYearsAreDivisibleByFourHundred() {
		assertThat(LeapsYear.isLeapYear(2000), is(true));
	}

}
