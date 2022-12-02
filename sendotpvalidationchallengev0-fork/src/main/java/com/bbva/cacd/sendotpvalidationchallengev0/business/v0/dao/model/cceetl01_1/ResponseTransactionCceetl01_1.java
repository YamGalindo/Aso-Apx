package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1;

import com.bbva.jee.arq.spring.core.host.Cabecera;
import com.bbva.jee.arq.spring.core.host.NombreCabecera;
import com.bbva.jee.arq.spring.core.host.Formato;
import com.bbva.jee.arq.spring.core.host.RespuestaTransaccion;

/**
 * Bean de respuesta para la transacci&oacute;n <code>CCEETL01</code>
 * 
 * @see RequestTransactionCceetl01_1
 */
@RespuestaTransaccion
@Formato(nombre = "1")
public class ResponseTransactionCceetl01_1 {
	
	/**
	 * <p>Cabecera <code>COD-AVISO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.CODIGO_AVISO)
	private String codigoAviso;
	
	/**
	 * <p>Cabecera <code>DES-AVISO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.DESCRIPCION_AVISO)
	private String descripcionAviso;
	
	/**
	 * <p>Cabecera <code>COD-UUAA-AVISO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.APLICACION_AVISO)
	private String aplicacionAviso;
	
	/**
	 * <p>Cabecera <code>COD-RETORNO</code></p>
	 */
	@Cabecera(nombre=NombreCabecera.CODIGO_RETORNO)
	private String codigoRetorno;
	

    public String getCodigoAviso() {
        return codigoAviso;
    }

    public void setCodigoAviso(String codigoAviso) {
        this.codigoAviso = codigoAviso;
    }

    public String getDescripcionAviso() {
        return descripcionAviso;
    }

    public void setDescripcionAviso(String descripcionAviso) {
        this.descripcionAviso = descripcionAviso;
    }

    public String getAplicacionAviso() {
        return aplicacionAviso;
    }

    public void setAplicacionAviso(String aplicacionAviso) {
        this.aplicacionAviso = aplicacionAviso;
    }

    public String getCodigoRetorno(){
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }
}