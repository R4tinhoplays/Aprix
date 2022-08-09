package Cliente;

public final class Cliente {
    
    private String Nome;
    private String CPF;
    private int telefone;
    private String endereço;

    public Cliente(String Nome, String CPF, int telefone, String endereço) {
    setNome(Nome);
    setCPF(CPF);
    setTelefone(telefone);
    setEndereço(endereço);
    }

    public Cliente() {
        
    }

 
  
 
    public void CadastroCliente(Cliente cliente){
        cliente.getClass(cliente);
    }

 

    public String getNome() {
        return Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    private void getClass(Cliente cliente) {
        
    }

    public void getCPF(String parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getNome(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getEndereço(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getTelefone(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }

 