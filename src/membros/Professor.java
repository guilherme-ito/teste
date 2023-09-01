package membros;

public class Professor extends Membro {
	
//	fields
	private String departamento;
	
//  constructor
    public Professor(String nome, String registro, String departamento) {
        super(nome, registro);
        setPrazo(10);
        setLimiteItens(3);
        this.departamento = departamento;
    }
//    methods
    
    
//  getters
    public String getDepartamento() {
        return departamento;
    }

//  setters
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    

    
}