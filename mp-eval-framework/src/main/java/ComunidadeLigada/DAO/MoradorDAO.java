/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComunidadeLigada.DAO;

import ComunidadeLigada.Modelo.Morador;
import ComunidadeLigada.Modelo.ServicoComunidade;
import Framework.DAO.ClienteDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jessica
 */
public class MoradorDAO implements ClienteDAO<Morador>{

    private Connection conn = null;
    
    private void loadConnection(){
        try{
            if(conn != null) return;
            
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/comunidadeligada","pssuser","gameover");
        }
        catch(Exception ex){
            
        }
    }
    
    private void closeConnection(){
        try{
            this.conn.close();
        }
        catch(Exception ex){
            
        }        
    }
            
    public MoradorDAO() {
    }
    
    public static void main(String[] args) {
        MoradorDAO mor = new MoradorDAO();
        mor.findAll();
    }
    
    @Override
    public Morador[] findAll() {
        List<Morador> moradores = new ArrayList<>();
        try{
            loadConnection();
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery("select * from morador");
            while(rs.next()){
                Morador m = new Morador();
                m.setIdentificador(rs.getInt("identificador"));
                m.setNome(rs.getString("nome"));
                m.setUri(rs.getString("uri"));
                
                
                PreparedStatement stmt2 = conn.prepareStatement("select s.* from morador_servico ms inner join morador m on ms.morador = m.identificador inner join servico s on s.identificador = ms.servico where m.identificador = ?");
                stmt2.setInt(1, m.getIdentificador());
                ResultSet rs2 = stmt2.executeQuery();
                List<ServicoComunidade> servicos = new ArrayList<>();
                while(rs2.next()){
                    ServicoComunidade serv = new ServicoComunidade();
                    serv.setIdentificador(rs2.getInt("identificador"));
                    serv.setNome(rs2.getString("nome"));
                    serv.setDescricao(rs2.getString("descricao"));
                    servicos.add(serv);
                }
                rs2.close();
                stmt2.close();
                m.setServicosInteresse(servicos.toArray(new ServicoComunidade[servicos.size()]));
                moradores.add(m);
            }
            rs.close();
            stmt.close();
            closeConnection();
        }
        catch(Exception ex){
            
        }
        
        return moradores.toArray(new Morador[moradores.size()]);
    }

    @Override
    public Morador add(Morador c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Morador update(Morador c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Morador c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Morador retrieve(int id) {
        Morador m = new Morador();
        try{
            loadConnection();
            Statement stmt = conn.createStatement(); 
            ResultSet rs = stmt.executeQuery("select * from morador");
            if(rs.next()){
                m.setIdentificador(rs.getInt("identificador"));
                m.setNome(rs.getString("nome"));
                m.setUri(rs.getString("uri"));
                
                
                PreparedStatement stmt2 = conn.prepareStatement("select s.* from morador_servico ms inner join morador m on ms.morador = m.identificador inner join servico s on s.identificador = ms.servico where m.identificador = ?");
                stmt2.setInt(1, m.getIdentificador());
                ResultSet rs2 = stmt2.executeQuery();
                List<ServicoComunidade> servicos = new ArrayList<>();
                while(rs2.next()){
                    ServicoComunidade serv = new ServicoComunidade();
                    serv.setIdentificador(rs2.getInt("identificador"));
                    serv.setNome(rs2.getString("nome"));
                    serv.setDescricao(rs2.getString("descricao"));
                    servicos.add(serv);
                }
                rs2.close();
                stmt2.close();
                m.setServicosInteresse(servicos.toArray(new ServicoComunidade[servicos.size()]));
            }
            rs.close();
            stmt.close();
            closeConnection();
        }
        catch(Exception ex){
            
        }
        
        return m;
    }

    
}
