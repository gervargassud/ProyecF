/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import javax.swing.JOptionPane;

/**
 *
 * @author andrea
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
        
      public static void main(String[] args) {
         
        String usuario = "GermanV";
        String contrasenia = "GERMAN1234";
        boolean verificar = usuarioYContrasenia ( usuario, contrasenia);
        
        if (verificar) {
            
            
            JOptionPane.showMessageDialog(null,"Cantidad de intentos agotados, pruebe intentar dentro de 12 hrs");
            
            
        } else{
            
            
            int anio,cuotaPorMarca, precioFinal;
            String marca;
            String marca1;
            String[] altaGama = {"BMW", "VOLVO", "AUDI"};
            
            
            marca = JOptionPane.showInputDialog("Ingrese la marca del auto");
            
            anio = Integer.parseInt( JOptionPane.showInputDialog("Ingrese el año del auto"));
            
            marca1 = marca.toUpperCase();
            
            boolean buscar1 = buscarMarca (marca1, altaGama);
            
            if(buscar1){
                
                cuotaPorMarca = 1800;
                
            } else {
                
                cuotaPorMarca = 890;
                
            }
            
            
            int PrecioSegunAnio = cotizarA(anio);
            
            precioFinal = cuotaPorMarca + PrecioSegunAnio;
            
            JOptionPane.showMessageDialog(null, "Tu auto de modelo: " +marca1 + "     del año: "+anio  + "\n    Tiene una cuota a pagar de: $"+precioFinal );
        }   
    }
      
  public static boolean usuarioYContrasenia(String usuario, String contrasenia){
      
      String intentoUsuario;
      String intentoContrasenia;
      String intentoUsuario1;
      int i = 0;
      
      while ( i <= 3){
          
          
      intentoUsuario = JOptionPane.showInputDialog("ingrese su usuario: ");
      intentoContrasenia = JOptionPane.showInputDialog("ingrese la contrasenia: ");
      intentoUsuario1 = intentoUsuario.toUpperCase();
      usuario = usuario.toUpperCase();
      
     
         if((intentoContrasenia.equals(contrasenia)) && (intentoUsuario1.equals(usuario))){
             
             i += 2;
             return true;
             
             
         }
          

                 i++; 
          
      }      
      
      
      
      return false;
  }    
    
  public static boolean buscarMarca(String marca1, String altaGama [])  {
      
      for (int i =0; i <= altaGama.length; i++) {
          
          if(altaGama.equals(marca1)){
              
              return false;
          }
          
      }
      
     return true; 
  }
    
    public static int cotizarA (int anio) {
        
        int Precio;
        
        if (anio < 1990){
            
            Precio = 350;
            
        }else {
            
            if (anio >= 1990 && anio <= 1999){
                
                Precio = 480;
                
            } else {
                
                if (anio > 1999 && anio <= 2010){
                    
                    Precio = 780;
                    
                } else {
                    
                    if (anio > 2010 && anio <= 2016){
                    
                        Precio = 950;
                    } else {
                        
                        Precio = 1200;
                    }
                }
            }
        }
      
        return Precio;
        
    }  
    
}

    

