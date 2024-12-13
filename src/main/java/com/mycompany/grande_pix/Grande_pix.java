/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grande_pix;

import com.mycompany.grande_pix.view.Login;
import java.sql.Connection;
import static model.Conection_db.getConection;

/**
 *
 * @author devmat
 */
public class Grande_pix {

    public static void main(String[] args) {
       //Login login = new Login();
       //login.setVisible(true);
       Connection conexão = getConection();
       if (conexão != null){
           System.out.println("conected");
       }else{
       System.out.println("conection error");
       }
    }
}
