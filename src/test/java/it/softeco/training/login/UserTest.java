package it.softeco.training.login;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserTest {

	@Spy
	User user;
	
	@Test
	public void shouldReturnNameAndSurname() {
		when(user.getName()).thenReturn("Giovanni").thenReturn("Marco");
		when(user.getSurname()).thenReturn("Depalmas").thenReturn("Rissos");

		assertThat(user.getNameAndSurname(), is("Giovanni Depalmas"));
		assertThat(user.getNameAndSurname(), is("Marco Rissos"));
	}
}
