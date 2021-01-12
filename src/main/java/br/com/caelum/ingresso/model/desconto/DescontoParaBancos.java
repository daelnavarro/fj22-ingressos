package br.com.caelum.ingresso.model.desconto;

import java.math.BigDecimal;

public class DescontoParaBancos implements Desconto{

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.subtract(trintaPorCentoSobre(precoOriginal));
	}

	private BigDecimal trintaPorCentoSobre(BigDecimal precoOriginal) {
		// TODO Auto-generated method stub
		return precoOriginal.multiply(new BigDecimal("0.3"));
	}

}
