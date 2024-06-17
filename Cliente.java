import java.util.List;

public class Cliente extends Usuario {
    private List<Contratacao> historicoContratacoes;

    public Cliente(int idUsuario, String nome, String email, String senha, List<Contratacao> historicoContratacoes) {
        super(idUsuario, nome, email, senha);
        this.historicoContratacoes = historicoContratacoes;
    }

    public List<Contratacao> getHistoricoContratacoes() {
        return historicoContratacoes;
    }

    public void setHistoricoContratacoes(List<Contratacao> historicoContratacoes) {
        this.historicoContratacoes = historicoContratacoes;
    }
}
