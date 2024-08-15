package com.pablocoding.app.web.entity;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "empleados")
public class Empleado implements Serializable {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 50)
    private String nombre;
    @Column(nullable = false, length = 50)
    private String apellido;
    @Column(nullable = false, length = 50)
    private String email;
    private int telefono;

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }
    private static final long serialVersionUID = 1L;

    @Entity
    @Table(name="proveedor")
    public static class Proveedor implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String nombre;
        private String cif;
        private String direccion;
        private String email;
        private int telefono;



        public long getId() {
            return id;
        }



        public void setId(long id) {
            this.id = id;
        }



        public String getNombre() {
            return nombre;
        }



        public void setNombre(String nombre) {
            this.nombre = nombre;
        }



        public String getCif() {
            return cif;
        }



        public void setCif(String cif) {
            this.cif = cif;
        }



        public String getDireccion() {
            return direccion;
        }



        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }



        public String getEmail() {
            return email;
        }



        public void setEmail(String email) {
            this.email = email;
        }



        public int getTelefono() {
            return telefono;
        }



        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }



        /**
         *
         */
        private static final long serialVersionUID = 1L;

    }
}