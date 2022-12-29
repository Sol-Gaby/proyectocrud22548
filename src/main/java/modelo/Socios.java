package modelo;

import java.sql.Date;
import java.time.LocalDate;

public class Socios 
{
   private int idSocio;
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;
    private LocalDate  fechaNac;
    private String email;
    private String telefono;
    private boolean activo;
    
    
    public Socios(int idSocio,String nombre,String apellido,String direccion,String localidad,LocalDate fnac,String mail,String telefono, boolean activo)
    {
        this.idSocio=idSocio;
        this.nombre=nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.localidad=localidad;
        this.fechaNac=fnac;
        this.email=mail;
        this.telefono=telefono;
        this.activo=activo;        
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFnac() {
        return fechaNac;
    }

    public void setFnac(LocalDate fnac) {
        this.fechaNac = fnac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
        
}
/**
 *
 * @author Sol
 */