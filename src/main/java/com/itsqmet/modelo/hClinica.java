package com.itsqmet.modelo;

import jakarta.validation.constraints.*;

public class hClinica {

    private Integer id;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 3, max = 40, message = "El nombre debe tener entre 3 y 40 caracteres")
    private String nombre;

    @NotNull(message = "La edad es obligatoria")
    @Min(value = 0, message = "La edad no puede ser negativa")
    @Max(value = 120, message = "La edad no puede superar 120 años")
    private Integer edad;

    @NotBlank(message = "El género es obligatorio")
    private String genero;

    @Pattern(regexp = "\\d{10}", message = "El teléfono debe tener 10 dígitos")
    private String telefono;

    @Size(max = 100)
    private String alergias;

    @Size(max = 100)
    private String enfermedadesCronicas;

    @Size(max = 100)
    private String medicamentosActuales;

    @Size(max = 100)
    private String cirugiasPrevias;

    @NotNull(message = "El peso es obligatorio")
    @DecimalMin(value = "1.0", message = "Peso inválido")
    @DecimalMax(value = "300.0", message = "Peso fuera de rango")
    private Double peso;

    @NotNull(message = "La estatura es obligatoria")
    @DecimalMin(value = "30.0", message = "Estatura inválida")
    @DecimalMax(value = "250.0", message = "Estatura fuera de rango")
    private Double estatura;

    @NotBlank(message = "La presión arterial es obligatoria")
    @Pattern(regexp = "\\d{2,3}/\\d{2,3}", message = "Formato válido: 120/80")
    private String presionArterial;

    @NotBlank(message = "El motivo de consulta es obligatorio")
    @Size(min = 5, max = 200)
    private String motivoConsulta;

    @NotBlank(message = "El diagnóstico es obligatorio")
    @Size(min = 5, max = 200)
    private String diagnostico;

    @NotBlank(message = "El tratamiento es obligatorio")
    @Size(min = 5, max = 200)
    private String tratamiento;

    @Size(max = 300)
    private String observaciones;

    //CONSTRUCTORES
    //Vacio
    public hClinica() {
    }
    public hClinica(int id, String nombre, int edad, String genero, String telefono, String alergias, String enfermedadesCronicas, String medicamentosActuales, String cirugiasPrevias, double peso, double estatura, String presionArterial, String motivoConsulta, String diagnostico, String tratamiento, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
        this.alergias = alergias;
        this.enfermedadesCronicas = enfermedadesCronicas;
        this.medicamentosActuales = medicamentosActuales;
        this.cirugiasPrevias = cirugiasPrevias;
        this.peso = peso;
        this.estatura = estatura;
        this.presionArterial = presionArterial;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }
    //Sin Id
    public hClinica(String nombre, int edad, String genero, String telefono, String alergias, String enfermedadesCronicas, String medicamentosActuales, String cirugiasPrevias, double peso, double estatura, String presionArterial, String motivoConsulta, String diagnostico, String tratamiento, String observaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
        this.alergias = alergias;
        this.enfermedadesCronicas = enfermedadesCronicas;
        this.medicamentosActuales = medicamentosActuales;
        this.cirugiasPrevias = cirugiasPrevias;
        this.peso = peso;
        this.estatura = estatura;
        this.presionArterial = presionArterial;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }
    //GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedadesCronicas() {
        return enfermedadesCronicas;
    }

    public void setEnfermedadesCronicas(String enfermedadesCronicas) {
        this.enfermedadesCronicas = enfermedadesCronicas;
    }

    public String getMedicamentosActuales() {
        return medicamentosActuales;
    }

    public void setMedicamentosActuales(String medicamentosActuales) {
        this.medicamentosActuales = medicamentosActuales;
    }

    public String getCirugiasPrevias() {
        return cirugiasPrevias;
    }

    public void setCirugiasPrevias(String cirugiasPrevias) {
        this.cirugiasPrevias = cirugiasPrevias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}

