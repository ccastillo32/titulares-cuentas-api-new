package coop.tecso.examen.titularescuentasapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import coop.tecso.examen.titularescuentasapi.model.TipoTitular;
import coop.tecso.examen.titularescuentasapi.model.Titular;
import coop.tecso.examen.titularescuentasapi.model.TitularFisico;
import coop.tecso.examen.titularescuentasapi.repository.TitularRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TitularesCuentasApiApplicationTests {

    @Autowired
    private TitularRepository dao;
    
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testDAO() {
	    try {
	        
	        TipoTitular tipo = new TipoTitular();
	        tipo.setId(1);
	        
	        TitularFisico titular = new TitularFisico();
	        titular.setCuit("20-12345678-9");
	        titular.setDni("12345678");
	        titular.setNombre("a");
	        titular.setApellido("b");
	        titular.setTipo(tipo);
	        titular.setHabilitado(true);
	        
	        dao.save(titular);
	        
	    } catch(Exception exp) {
	        exp.printStackTrace(System.out);
	    }
	}

}
