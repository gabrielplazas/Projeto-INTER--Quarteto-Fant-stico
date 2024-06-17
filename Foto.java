import java.util.Date;

public class Foto {
    private int idFoto;
    private Cliente cliente;
    private String url;
    private Date dataUpload;
    private String descricao;

    public Foto(int idFoto, String url, Date dataUpload, String descricao) {
        this.idFoto = idFoto;
        this.url = url;
        this.dataUpload = dataUpload;
        this.descricao = descricao;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(int idFoto) {
        this.idFoto = idFoto;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getDataUpload() {
        return dataUpload;
    }

    public void setDataUpload(Date dataUpload) {
        this.dataUpload = dataUpload;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}