
package mx.com.delasalle;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Conocer que esta clase e sparte del contenedor spring
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador REST");
        log.debug("más detalle pero en debug");
        return "Hola mundo con Spring";
    }
    
}
