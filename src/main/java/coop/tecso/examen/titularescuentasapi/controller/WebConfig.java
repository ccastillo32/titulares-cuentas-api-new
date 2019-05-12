package coop.tecso.examen.titularescuentasapi.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Para configurar el CORS globalmente.
 * @author Cristian
 *
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        configurarCORSParaClientesApp(registry);
    }
    
    private void configurarCORSParaClientesApp(CorsRegistry registry) {
        String endPointsAccesibles = "/**"; // Todos
        String[] metodosPermitidos = new String[] { "POST", "GET", "PUT", "OPTIONS", "DELETE" };
        String url = "*"; // Podría ser http://localhost:4200, pero en este caso, se dejará para todos.
        registry.addMapping(endPointsAccesibles).allowedOrigins(url).allowedMethods(metodosPermitidos);
    }
    
}

