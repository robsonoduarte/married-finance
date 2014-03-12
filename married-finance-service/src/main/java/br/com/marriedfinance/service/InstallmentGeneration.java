package br.com.marriedfinance.service;

import br.com.marriedfinance.domain.Installment;

public interface InstallmentGeneration {

	Installment generationInstallment(double... values);

}
