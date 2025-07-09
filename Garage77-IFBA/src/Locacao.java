/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;


public class Locacao {
    private int codigoL;
    private String marca;
    private String modelo;
    private String placaAutomovel;
    private String situacao;
    private int valorTotal;
    private int largura;
    private int comprimento;
    private date dataEntrada;
    private date dataSaida;
    private time horaEntrada;
    private time horaSaida;
    private int fk_CodigoC;
    private int fk_CodigoV;
    
public Locacao(int codigoL, String marca, String modelo, String placaAutomovel,
                   String situacao, int valorTotal, int largura, int comprimento,
                   Date dataEntrada, Date dataSaida, Time horaEntrada, Time horaSaida,
                   int fk_CodigoC, int fk_CodigoV) {
        this.codigoL = codigoL;
        this.marca = marca;
        this.modelo = modelo;
        this.placaAutomovel = placaAutomovel;
        this.situacao = situacao;
        this.valorTotal = valorTotal;
        this.largura = largura;
        this.comprimento = comprimento;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.fk_CodigoC = fk_CodigoC;
        this.fk_CodigoV = fk_CodigoV;
    }
    public int getCodigoL(){
        return codigoL;
    }
    public void setCodigoL (int codigoL){
        this.codigoL = codigoL;
    }
    
    public String getMarca (){
        return marca;
    }
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public String getModelo (){
        return modelo;
    }
    public void setModelo ( String modelo ){
        this.modelo = modelo;
    }
    
    public String getPlacaAutomovel (){
        return placaAutomovel;
    }
    public void setPlacaAutomovel ( String placaAutomovel){
        this.placaAutomovel = placaAutomovel;
    }
    
    public String getSituacao (){
        return situacao;
    }
    public void setSituacao ( String situacao){
        this.situacao = situacao;
    }
    
    public int getValorTotal (){
        return valorTotal;
    }
    public void setValorTotal ( int valorTotal){
        this.valorTotal = valorTotal;
    }
    
    public int setlargura (){
        return largura;
    }
    public void setlargura ( int largura){
        this.largura = largura;
    }
    
    public int getComprimento (){
        return comprimento;
    }
    public void setComprimento ( int comprimento){
        this.comprimento = comprimento;
    }
    
    public String getDataEntrada (){
        return ""+dataEntrada.getDate() + "/" + dataEntrada.getMonth() + "/" + dataEntrada.getYear();
    }
    public void setDataEntrada ( String dataEntrada){
        this.dataEntrada = dataEntrada;
    }
    
    public date getDataSaida (){
        return dataSaida;
    }
    public void setDataSaida ( date dataSaida){
        this.dataSaida = dataSaida;
    }
    
    public time getHoraEntrada (){
        return horaEntrada;
    }
    public void setHoraEntrada ( time horaEntrada){
        this.horaEntrada = horaEntrada;
    }
    
    public time getHoraSaida (){
        return horaSaida;
    }
    public void setHoraSaida ( time fk_CodigoC){
        this.fk_CodigoC = fk_CodigoC;
    }
    
    public int getFk_CodigoC (){
        return fk_CodigoC;
    }
    public void setFk_CodigoC ( int fk_CodigoC){
        this.fk_CodigoC = fk_CodigoC;
    }

    public int getFk_CodigoV (){
        return fk_CodigoV;
    }
    public void setFk_CodigoV ( int fk_CodigoV){
        this.fk_CodigoV = fk_CodigoV;
    }

}
