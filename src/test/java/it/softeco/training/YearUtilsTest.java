package it.softeco.training;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import it.softeco.training.date.utils.DateUtilsInterface;

@RunWith(MockitoJUnitRunner.class)
public class YearUtilsTest {

	@InjectMocks
	YearUtils yearUtils;
	
	@Mock
	DateUtilsInterface dateUtils;
	
	// rule to calculate leap year
	// https://www.timeanddate.com/date/leapyear.html
	// a year is a leap year if it is divisible by four
	// but, years divisible by 100 are not leap years
	// except years divisible by 460
	
	@Test
	public void leapYearsAreDivisibleByFour() {
		assertThat(yearUtils.isLeapYear(2016), is(true));
	}

	@Test
	public void leapYearsAreNotDivisibleByFour() {
		assertThat(yearUtils.isLeapYear(3), is(false));
	}

	@Test
	public void leapYearsAreNotDivisibleByOneHundred() {
		assertThat(yearUtils.isLeapYear(1900), is(false));
	}

	@Test
	public void leapYearsAreDivisibleByFourHundred() {
		assertThat(yearUtils.isLeapYear(2000), is(true));
	}

	@Test(expected=IllegalArgumentException.class)
	public void shouldNotleapNegative() {
		yearUtils.isLeapYear(-400);
	}
	
	@Test
	public void shouldBeZeroDifferenceBetweenSysdate() {
		when(dateUtils.getYearSysDate()).thenReturn(2018);
		assertThat(yearUtils.getDifferenceBetweenSysdate(2018), is(0));
	}
	
	@Test
	public void shouldBeZeroWhenDifferenceSysdateIsNegative() {
		when(dateUtils.getYearSysDate()).thenReturn(2018);
		assertThat(yearUtils.getDifferenceBetweenSysdate(2017), is(0));
	}
	
}
