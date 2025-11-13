package com.ArthurHenriqueDev.e_commerce.Domain.Entities.Pagamentos;

import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.DateTimeValido;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.PixCopiaECola;
import com.ArthurHenriqueDev.e_commerce.Domain.ValueObjects.TextoValido;

public class Pix {

    private TextoValido qrCode;
    private PixCopiaECola pixCopiaECola;
    private DateTimeValido dataExpiracao;

    public Pix(TextoValido qrCode, PixCopiaECola pixCopiaECola, DateTimeValido dataExpiracao) {
        this.qrCode = qrCode;
        this.pixCopiaECola = pixCopiaECola;
        this.dataExpiracao = dataExpiracao;
    }
}
