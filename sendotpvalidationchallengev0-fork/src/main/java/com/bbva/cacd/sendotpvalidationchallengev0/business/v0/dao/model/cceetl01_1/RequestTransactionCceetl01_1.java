package com.bbva.cacd.sendotpvalidationchallengev0.business.v0.dao.model.cceetl01_1;

import com.bbva.jee.arq.spring.core.host.Atributo;
import com.bbva.jee.arq.spring.core.host.Campo;
import com.bbva.jee.arq.spring.core.host.TipoCampo;
import com.bbva.jee.arq.spring.core.host.Transaccion;

/**
 * <p>Transacci&oacute;n <code>CCEETL01</code></p>
 * <p>Informaci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Tipo:</b> 1</li>
 *    <li><b>Subtipo:</b> 1</li>
 *    <li><b>Versi&oacute;n:</b> 1</li>
 *    <li><b>Clase de petici&oacute;n:</b> RequestTransactionCceetl01_1</li>
 *    <li><b>Clase de respuesta:</b> ResponseTransactionCceetl01_1</li>
 * </ul>
 * </p>
 * <p>Configuraci&oacute;n de la transacci&oacute;n:
 * <ul>
 *    <li><b>Nombre configuraci&oacute;n:</b> default_apx</li>
 * </ul>
 * </p>
 * <p>Copy de la transacci&oacute;n:</p>
 * <code><pre> * FICHERO: CCEETL01-01-CO.xml
 * &lt;?xml version=&quot;1.0&quot; encoding=&quot;UTF-8&quot; standalone=&quot;yes&quot;?&gt;
 * &lt;transaction xmlns=&quot;http://www.w3schools.com&quot; transactionName=&quot;CCEETL01&quot; application=&quot;CCEE&quot; version=&quot;01&quot; country=&quot;CO&quot; language=&quot;ES&quot;&gt;
 * &lt;paramsIn&gt;
 * &lt;parameter order=&quot;1&quot; name=&quot;personalId&quot; mandatory=&quot;1&quot; type=&quot;String&quot; size=&quot;10&quot;/&gt;
 * &lt;/paramsIn&gt;
 * &lt;paramsOut/&gt;
 * &lt;description&gt;transaction consulting candidate existence&lt;/description&gt;
 * &lt;/transaction&gt;
</pre></code>
 * 
 * @see ResponseTransactionCceetl01_1
 *
 * @author Arquitectura Spring BBVA
 */
@Transaccion(
	nombre = "CCEETL01",
	tipo = 1, 
	subtipo = 1,	
	version = 1,
	configuracion = "default_apx",
	respuesta = ResponseTransactionCceetl01_1.class,
	atributos = {@Atributo(nombre = "country", valor = "CO")}
)
public class RequestTransactionCceetl01_1 {
		
		/**
	 * <p>Campo <code>personalId</code>, &iacute;ndice: <code>1</code>, tipo: <code>ALFANUMERICO</code>
	 */
	@Campo(indice = 1, nombre = "personalId", tipo = TipoCampo.ALFANUMERICO, longitudMaxima = 10, signo = true, obligatorio = true)
	private String personalId;
	

	public String getPersonalId() {
	    return personalId;
	}

	public void setPersonalId(String personalId) {
    	this.personalId = personalId;
	}
}