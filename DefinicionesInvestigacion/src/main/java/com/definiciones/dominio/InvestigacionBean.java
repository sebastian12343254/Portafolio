package com.definiciones.dominio;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class InvestigacionBean {

    private Investigacion investigacion;

    public InvestigacionBean() {
        investigacion = new Investigacion(
            "Tipos de investigación",
            "Esta investigación explicas dos de las diferentes metodologías aplicadas en la investigación científica moderna.",
            "Referencias",
            "investigacion.jpg"
        );
    }

    public Investigacion getInvestigacion() {
        return investigacion;
    }

    public void setInvestigacion(Investigacion investigacion) {
        this.investigacion = investigacion;
    }
}
