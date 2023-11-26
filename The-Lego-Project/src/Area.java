public class Area {
    private int areaDaCasa;
    private int areaDaGaragem;
    private int areaDoJardim;

    public Area(){
        this.areaDaCasa = 0;
        this.areaDaGaragem = 0;
        this.areaDoJardim = 0;
    }

    public int getAreaDaCasa() {
        return areaDaCasa;
    }

    public void setAreaDaCasa(int areaDaCasa) {
        this.areaDaCasa = areaDaCasa;
    }

    public int getAreaDaGaragem() {
        return areaDaGaragem;
    }

    public void setAreaDaGaragem(int areaDaGaragem) {
        this.areaDaGaragem = areaDaGaragem;
    }

    public int getAreaDoJardim() {
        return areaDoJardim;
    }

    public void setAreaDoJardim(int areaDoJardim) {
        this.areaDoJardim = areaDoJardim;
    }
}
