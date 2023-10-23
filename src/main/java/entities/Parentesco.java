package entities;

public class Parentesco {
    private Long id;
    private boolean pai;
    private boolean mae;

    public Parentesco() {
    }

    public Parentesco(Long id, boolean pai, boolean mae) {
        this.id = id;
        this.pai = pai;
        this.mae = mae;
    }

    public Long getId() {
        return id;
    }


    public boolean isPai() {
        return pai;
    }

    public void setPai(boolean pai) {
        this.pai = pai;
    }

    public boolean isMae() {
        return mae;
    }

    public void setMae(boolean mae) {
        this.mae = mae;
    }
}
