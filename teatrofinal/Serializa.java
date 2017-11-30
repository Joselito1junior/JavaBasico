package br.unipe.java.teatrofinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serializa implements Serializable {
    
	   public static ArrayList<Usuario> clientes = new ArrayList<>();
	   
	    public static void serializaClientes(String arquivo) {
			try {
				FileOutputStream fos = new FileOutputStream(arquivo);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(clientes);
				fos.close();
				oos.close();
			} catch (Exception e) {
				System.out.println("Erro no serializa");
				
			}
		}
		
		
		public static void loadClientes(String arquivo) {
			try {
				FileInputStream fis = new FileInputStream(arquivo);
				ObjectInputStream ois = new ObjectInputStream(fis);
				clientes = (ArrayList<Usuario>) ois.readObject();
				fis.close();
				ois.close();
			} catch (Exception e) {
	                System.out.println("Não foi possivel iniciar clientes");
			}
		
		}
	    
	    
	    
	    static void carregarLugares(String nome){
	        
	        try {
	            FileInputStream in = new FileInputStream(nome+".ser");
	            ObjectInputStream objtIn = new ObjectInputStream(in);
	            Cadeira.usua = (br.unipe.java.teatrofinal.Usuario[]) objtIn.readObject();
	            in.close();
	            objtIn.close();
	            
	        } catch (FileNotFoundException ex) {
	            System.out.println("Arquivo não existe");    
	        
	        }catch (IOException ex) {
	            System.out.println("Arquivo não existe"); 
	        }catch (Exception ex) {
	            System.out.println("Arquivo não existe"); 
	        }
	        
	    
	    }
	    
	    static void salvarLugares(String nome){
	        try {
	            FileOutputStream out = new FileOutputStream(nome+".ser");
	            ObjectOutputStream objtOut = new ObjectOutputStream(out);
	            objtOut.writeObject(Cadeira.usua);
	            objtOut.close();
	            out.close();
	        }catch (FileNotFoundException ex) {
	            System.out.println("Arquivo não existe"); 
	        }
	        catch (IOException ex) {
	            Logger.getLogger(Serializa.class.getName()).log(Level.SEVERE, null, ex);
	        }catch (Exception ex) {
	            Logger.getLogger(Serializa.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	    
	    static boolean testCpf(Usuario usu){
	        for (Usuario usuaTeste : clientes) {
	            if(usuaTeste.getCpf().equals(usu.getCpf())){
	                return true;
	            }else {
	                return false;
	            }
	        }
	        return false;
	    }
	    
	     static void cadUsuario(Usuario usuario){
	        Serializa.clientes.add(usuario);
	    }
	     static Usuario ConsulteCpf(String cpf){
	        for (Usuario usuaTeste : clientes) {
	            if(usuaTeste.getCpf().equals(cpf)){
	                return usuaTeste;
	            }else {
	                return null;
	            }
	        }
	        return null;
	    }
	   
	    
	}