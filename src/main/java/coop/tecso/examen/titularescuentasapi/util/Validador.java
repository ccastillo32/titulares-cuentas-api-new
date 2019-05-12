package coop.tecso.examen.titularescuentasapi.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import coop.tecso.examen.titularescuentasapi.dto.TitularFisicoDto;
import coop.tecso.examen.titularescuentasapi.dto.TitularJuridicoDto;

public class Validador {
    
    public static List<String> validarTitularFisico(TitularFisicoDto titularFisico) {
        List<String> validaciones = new ArrayList<>();
        boolean cuitEsValido = false;
        String cuit = titularFisico.getCuit();
        String dni = titularFisico.getDni();
        String nombres = titularFisico.getNombre();
        String apellidos = titularFisico.getApellido();
        
        // validar cuit
        
        if(esVacio(cuit)) {
            validaciones.add("El campo CUIT es obligatorio");
        } else if(!esUnCUITValido(cuit)) {
            validaciones.add("El campo CUIT debe tener el formato (20|23|24|27|30|33|34)-XXXXXXXX-X");
        }
        
        cuitEsValido = validaciones.isEmpty();

        // validar dni
        
        if(esVacio(dni)) {
            validaciones.add("El campo DNI es obligatorio");
        } else if(!esNumero(dni)) {
            validaciones.add("El campo DNI debe ser un número");
        } else if(!(dni.length() == 8)) {
            validaciones.add("El campo DNI debe ser de 8 caracteres");
        } else if(cuitEsValido && !(cuit.contains(dni))) {
            validaciones.add("El campo DNI no esta contenido como una parte del CUIT");
        }
        
        // validar nombres
        
        if(esVacio(nombres)) {
            validaciones.add("El nombre del titular es obligatorio");
        }
        
        // validar apellidos
        
        if(esVacio(apellidos)) {
            validaciones.add("El apellido del titular es obligatorio");
        }

        return validaciones;
    }
    
    public static List<String> validarTitularJuridico(TitularJuridicoDto titularJuridico) {
        List<String> validaciones = new ArrayList<>();
        String cuit = titularJuridico.getCuit();
        String razonSocial = titularJuridico.getRazonSocial();
        Integer anioFundacion = titularJuridico.getAnioFundacion();
        
        // validar cuit
        
        if(esVacio(cuit)) {
            validaciones.add("El campo CUIT es obligatorio");
        } else if(!esUnCUITValido(cuit)) {
            validaciones.add("El campo CUIT debe tener el formato (20|23|24|27|30|33|34)-XXXXXXXX-X");
        }

        // validar razon social
        
        if(esVacio(razonSocial)) {
            validaciones.add("El campo razón social es obligatorio");
        }
        
        // validar anio fundacion
        
        if(esVacio(anioFundacion)) {
            validaciones.add("El nombre del titular es obligatorio");
        } else if(anioFundacion.intValue() == 0) {
            validaciones.add("El campo año de fundacion no puede ser cero");
        }
        
        return validaciones;
    }
    
    public static boolean esUnCUITValido(String cuit) {
        String regex = "\\b(20|23|24|27|30|33|34)(\\D)?[0-9]{8}(\\D)?[0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cuit);
        return matcher.matches();
    }
    
    public static boolean esVacio(String valor) {
        return valor == null || valor.isEmpty();
    }
    
    public static boolean esVacio(Integer valor) {
        return valor == null || valor.intValue() == 0;
    }
    
    public static boolean esVacio(Object valor) {
        return valor == null;
    }
    
    public static boolean esNumero(String valor) {
        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(valor);
        return matcher.matches();
    }

}
