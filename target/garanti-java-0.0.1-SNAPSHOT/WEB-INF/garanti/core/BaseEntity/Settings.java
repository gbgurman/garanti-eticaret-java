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
public class Settings
{   
        public String Mode="Test";// Kullandığınız ortama göre değiştirmelisiniz.       
        public String Version="V0.1";// Sabit Kalmalı  
        public String BaseUrl="https://sanalposprovtest.garanti.com.tr/VPServlet"; //Test Adresi  // Üretim otamına geçtiğinizde adresi değiştirmelisiniz.  
        public String Password="123qweASD/";//Kendi şifreniz ile değiştirmelisiniz. 
}
