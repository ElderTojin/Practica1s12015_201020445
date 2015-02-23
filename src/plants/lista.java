/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plants;
/**
 *
 * @author debian
 */
public class lista {
      public boolean jug = false;

   	public Nodo inicio;		
      
	public lista(){
		inicio = null;
	}
	
	public void insertar(String d){
		Nodo tmp = new Nodo();	
		tmp.dato = d;
		
		Nodo aux = inicio;	
		if(inicio == null)
                {
			inicio = tmp;	
                        
                        
                }       
		else
		{
			while(true)	
			{
				if(aux.siguiente!=null)
                                {aux = aux.siguiente;
                                
                                        }
				else
					break;
			}
			
			aux.siguiente = tmp;	
			aux.siguiente.anterior = aux;
		}
	}
	
	public void recorrer(){
             
		Nodo aux = inicio;			
		while(true)
		{
			System.out.print(aux.dato+" ->");
			if(aux.siguiente!= null){	
                                jug = true;
				aux = aux.siguiente;}
                        else{
                           
				break;			}
		}
		
	}          
}
