package com.medista.api.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.Calendar;

@Data
public class EmbarazoActual {

    @Field("is_embarazada")
    private Boolean isEmbarazada = false;

    @Field("fum")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date fum; // Fecha de Última Menstruación

    @Field("fpp")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date fpp; // Fecha Probable de Parto

    @Field("semanas_gestacion")
    private Integer semanasGestacion;

    @Field("controles_prenatales")
    private Integer controles;

    @Field("inmunizaciones")
    private String inmunizaciones;

    @Field("descripcion")
    private String descripcion;

    @Field("fecha_registro")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date fechaRegistro;

    // ✅ CONSTRUCTOR por defecto
    public EmbarazoActual() {
        this.isEmbarazada = false;
        this.fechaRegistro = new Date();
    }

    // ✅ MÉTODOS CORREGIDOS

    /**
     * Calcula automáticamente las semanas de gestación basado en FUM
     */
    public void calcularSemanasGestacion() {
        if (this.fum != null) {
            Date ahora = new Date();
            long diferenciaMilis = ahora.getTime() - this.fum.getTime();
            long dias = diferenciaMilis / (1000 * 60 * 60 * 24);
            this.semanasGestacion = (int) (dias / 7);
        }
    }

    /**
     * Calcula automáticamente FPP basado en FUM (280 días después)
     */
    public void calcularFpp() {
        if (this.fum != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.fum);
            calendar.add(Calendar.DAY_OF_YEAR, 280); // 280 días después
            this.fpp = calendar.getTime();
        }
    }

    /**
     * Método auxiliar para establecer FUM desde String (formato yyyy-MM-dd)
     */
    public void setFumFromString(String fechaString) {
        try {
            if (fechaString != null && !fechaString.isEmpty()) {
                // Parsing simple para formato yyyy-MM-dd
                String[] partes = fechaString.split("-");
                if (partes.length == 3) {
                    int year = Integer.parseInt(partes[0]);
                    int month = Integer.parseInt(partes[1]) - 1; // Calendar usa 0-11
                    int day = Integer.parseInt(partes[2]);

                    Calendar cal = Calendar.getInstance();
                    cal.set(year, month, day, 0, 0, 0);
                    cal.set(Calendar.MILLISECOND, 0);

                    this.fum = cal.getTime();
                    this.calcularFpp();
                    this.calcularSemanasGestacion();
                }
            }
        } catch (Exception e) {
            System.err.println("Error al parsear fecha FUM: " + e.getMessage());
        }
    }

    /**
     * Método auxiliar para establecer FPP desde String
     */
    public void setFppFromString(String fechaString) {
        try {
            if (fechaString != null && !fechaString.isEmpty()) {
                String[] partes = fechaString.split("-");
                if (partes.length == 3) {
                    int year = Integer.parseInt(partes[0]);
                    int month = Integer.parseInt(partes[1]) - 1;
                    int day = Integer.parseInt(partes[2]);

                    Calendar cal = Calendar.getInstance();
                    cal.set(year, month, day, 0, 0, 0);
                    cal.set(Calendar.MILLISECOND, 0);

                    this.fpp = cal.getTime();
                }
            }
        } catch (Exception e) {
            System.err.println("Error al parsear fecha FPP: " + e.getMessage());
        }
    }

    /**
     * Obtiene FPP formateada como String yyyy-MM-dd
     */
    public String getFppFormatted() {
        if (this.fpp != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(this.fpp);
            return String.format("%d-%02d-%02d",
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH) + 1,
                    cal.get(Calendar.DAY_OF_MONTH));
        }
        return "";
    }

    /**
     * Obtiene FUM formateada como String yyyy-MM-dd
     */
    public String getFumFormatted() {
        if (this.fum != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(this.fum);
            return String.format("%d-%02d-%02d",
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH) + 1,
                    cal.get(Calendar.DAY_OF_MONTH));
        }
        return "";
    }
}