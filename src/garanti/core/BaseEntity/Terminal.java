/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garanti.core.BaseEntity;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Codevist
 */
public class Terminal 
{
        @XmlElement(name = "ProvUserID")
        public String ProvUserID ="PROVAUT"; //Garanti bankası tarafından sağlanan kendi bilgileriniz ile değiştirmelisiniz. 
        @XmlElement(name = "UserID")
        public String UserID ="PROVAUT";//Garanti bankası tarafından sağlanan kendi bilgileriniz ile değiştirmelisiniz. 
        @XmlElement(name = "ID")
        public String ID="30691297";// Garanti bankası tarafından sağlanan kendi bilgileriniz ile değiştirmelisiniz. 
        @XmlElement(name = "MerchantID")
        public String MerchantID="7000679";//Garanti bankası tarafından sağlanan kendi bilgileriniz ile değiştirmelisiniz. 
        @XmlElement(name = "HashData")
        public String HashData="";//Hash data sonradan hesaplanacak.
        
}
