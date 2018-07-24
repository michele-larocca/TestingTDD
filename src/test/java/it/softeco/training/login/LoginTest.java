package it.softeco.training.login;

import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoginTest {
	
	@Mock
	User user;
	
	@InjectMocks
	Login login;
	
	@Test
	public void testApp() {
		
		when(user.getName()).thenReturn("Giovanni").thenReturn("Marco");
		when(user.getSurname()).thenReturn("Depalmas").thenReturn("Rissos");

		
	}
}
