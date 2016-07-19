
package br.com.caelum.estoque.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.11
 * 2016-07-18T16:01:36.118-03:00
 * Generated source version: 2.7.11
 */

@WebFault(name = "AutorizacaoFault", targetNamespace = "http://ws.estoque.caelum.com.br/")
public class AutorizacaoException extends Exception {
    
    private br.com.caelum.estoque.ws.InfoFault autorizacaoFault;

    public AutorizacaoException() {
        super();
    }
    
    public AutorizacaoException(String message) {
        super(message);
    }
    
    public AutorizacaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutorizacaoException(String message, br.com.caelum.estoque.ws.InfoFault autorizacaoFault) {
        super(message);
        this.autorizacaoFault = autorizacaoFault;
    }

    public AutorizacaoException(String message, br.com.caelum.estoque.ws.InfoFault autorizacaoFault, Throwable cause) {
        super(message, cause);
        this.autorizacaoFault = autorizacaoFault;
    }

    public br.com.caelum.estoque.ws.InfoFault getFaultInfo() {
        return this.autorizacaoFault;
    }
}
