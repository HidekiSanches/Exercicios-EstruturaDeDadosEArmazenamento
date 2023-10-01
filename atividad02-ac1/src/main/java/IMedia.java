public abstract class IMedia implements Media{
    private String title;
    private Genero genero;
    private String type;

    public IMedia() {
    }

    public IMedia(String title, Genero genero, String type) {
        this.title = title;
        this.genero = genero;
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Genero getGenero() {
        return genero;
    }

    @Override
    public String getType() {
        return type;
    }
}
