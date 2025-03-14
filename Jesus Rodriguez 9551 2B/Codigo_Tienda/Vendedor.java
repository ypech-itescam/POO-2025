public class Vendedor {
     private String nombreVendedor;
     private String empresa;
    

    public Vendedor(String nombreVEString, String empresa){
        setNombreVendedor(nombreVendedor);
        setEmpresa(empresa);

    }

    public String getNombreVendedor(){
        return nombreVendedor;
    }

    public String getEmpresa(){
        return empresa;
    }


    public void setNombreVendedor(String nombreVendedor){
        if(nombreVendedor == null || nombreVendedor.isEmpty()){
            this.nombreVendedor = "Marcos";
        }else{
            this.nombreVendedor = nombreVendedor;
        }
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    
    

    public String toString(){
        return "NombreVendedor:" + getNombreVendedor() + "\n Empresa:" + getEmpresa();
    }
        
    }

