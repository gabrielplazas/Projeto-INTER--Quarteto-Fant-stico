import java.util.List;

public class Album {
    private int idAlbum;
    private Cliente cliente;
    private String descricao;
    private double datainicio;
    private double  datafinal;
    private double  valor;
    private List<Foto> fotos;

    public Album(int idAlbum, List<Foto> fotos) {
        this.idAlbum = idAlbum;
        this.fotos = fotos;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getDatainicio(){
        return datainicio;
    }
    public void setDatainicio(double datainicio) {
        this.datainicio = datainicio;
    }
    public double getDatafinal(){
        return datafinal;
    }
    public void setCliente(double datafinal) {
        this.datafinal = datafinal;
    }

}
 