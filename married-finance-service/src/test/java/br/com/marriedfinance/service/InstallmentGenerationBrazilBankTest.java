package br.com.marriedfinance.service;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.marriedfinance.domain.Installment;
import br.com.marriedfinance.service.brazilbank.InstallmentGenerationBrazilBank;


// starting the developing of draft mechanism for calculation of installment   

public class InstallmentGenerationBrazilBankTest {

	
	private InstallmentGeneration installmentGeneration;


	@Before
	public void setUp() throws Exception {
		installmentGeneration = new InstallmentGenerationBrazilBank();
	}

	
	@After
	public void tearDown() throws Exception {
	}

 
	@Test
	public void test() {
				
		Installment installment =  
				installmentGeneration.generationInstallment(21000.00, 218.75);
		
		assertThat( installment.value(), is(382.22) );	
		
	}
	
	
}
