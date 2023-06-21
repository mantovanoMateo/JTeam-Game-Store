/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guis.tp.pkgfinal;


import GUISS.LogIn;
import Model.Clases.Admin;
import Model.Clases.Steam;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class GUISTPFinal {
    public static void main(String [] args) {

        File file = new File("datos.json");
        ObjectMapper mapper =new ObjectMapper();
        Steam steam=null;

        try{
            steam=mapper.readValue(file,Steam.class);
            System.out.println("entro con el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            steam=new Steam();
            Admin admin=new Admin("Pepe","Grillo","20344678","pepegrillo@gmail.com","12345678a");
            steam.agregarAdmin(admin);
            System.out.println("entro nuevo");
        }

        LogIn lw=new LogIn(steam,mapper,file);
        lw.setVisible(true);

    }
    
}
