package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PlataformaDeEnvioTeste {

    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;

    @Test
    void tentaEnviarEmailEFalha() {
        Mockito.doThrow(IllegalStateException.class)
                .when(plataformaDeEnvio)
                .enviaEmail(Mockito.any());

        Assertions.assertThrows(IllegalStateException.class,
                () -> plataformaDeEnvio.enviaEmail(new Email("teste@teste.org", "Teste", Formato.TEXTO)));
    }
}
