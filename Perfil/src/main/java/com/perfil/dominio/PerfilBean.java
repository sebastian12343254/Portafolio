package com.perfil.dominio;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class PerfilBean {

    private Perfil perfil;

    public PerfilBean() {
        perfil = new Perfil(
            "Sebastian",
            "Tecnologia del la informacion y la comunicacion",
            "Java, c#, c++, python",
            "Fotoperfil.jpg",
            "Mysql",
            "Ninguno",
            "9.0"
        );
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
