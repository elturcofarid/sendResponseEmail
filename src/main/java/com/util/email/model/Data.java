package com.util.email.model;

public class Data {

    // "registro": [..
    //

    public String sender;
    public String plantillaCorreo;
    public String consivr;
    public String connectId;
    public String cantidadRegistros;
    public String nombresAdjuntoEmail;
    public String finalizo;
    public String urlDestino;

    public String getUrlDestino() {
        return urlDestino;
    }

    public void setUrlDestino(String urlDestino) {
        this.urlDestino = urlDestino;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getPlantillaCorreo() {
        return plantillaCorreo;
    }

    public void setPlantillaCorreo(String plantillaCorreo) {
        this.plantillaCorreo = plantillaCorreo;
    }

    public String getConsivr() {
        return consivr;
    }

    public void setConsivr(String consivr) {
        this.consivr = consivr;
    }

    public String getConnectId() {
        return connectId;
    }

    public void setConnectId(String connectId) {
        this.connectId = connectId;
    }

    public String getCantidadRegistros() {
        return cantidadRegistros;
    }

    public void setCantidadRegistros(String cantidadRegistros) {
        this.cantidadRegistros = cantidadRegistros;
    }

    public String getNombresAdjuntoEmail() {
        return nombresAdjuntoEmail;
    }

    public void setNombresAdjuntoEmail(String nombresAdjuntoEmail) {
        this.nombresAdjuntoEmail = nombresAdjuntoEmail;
    }

    public String getFinalizo() {
        return finalizo;
    }

    public void setFinalizo(String finalizo) {
        this.finalizo = finalizo;
    }
}

