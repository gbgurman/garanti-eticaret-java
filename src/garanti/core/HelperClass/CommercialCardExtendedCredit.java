/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garanti.core.HelperClass;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

/**
 *
 * @author Codevist
 */
public class CommercialCardExtendedCredit 
{
    @XmlElementWrapper(name = "PaymentList")
    @XmlElement(name = "Payment")
    public List<Payment> Payment;
}
