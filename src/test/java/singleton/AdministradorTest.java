package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdministradorTest {

    @Test
    public void deveRetornarNome() {
        Administrador.getInstance().setNome("Ademiro");
        assertEquals("Ademiro", Administrador.getInstance().getNome());
    }

    @Test
    public void deveRetornarEmail() {
        Administrador.getInstance().setEmail("ademiro@gmail.com");
        assertEquals("ademiro@gmail.com", Administrador.getInstance().getEmail());
    }
}
