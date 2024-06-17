import java.util.List;

public class Fotografo extends Usuario {
    private List<Album> portfolio;

    public Fotografo(int idUsuario, String nome, String email, String senha, List<Album> portfolio) {
        super(idUsuario, nome, email, senha);
        this.portfolio = portfolio;
    }

    public List<Album> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(List<Album> portfolio) {
        this.portfolio = portfolio;
    }
}
 
