package patterns.mediator;

public enum Action {
    HUNT("поймал кролика", "приходит на ужин"),
    TALE("рассказывает историю", "пришёл послушать"),
    GOLD("заметил золото", "добыл золото"),
    ENEMY("заметил противников", "убегает в укрытие"),
    NONE("", "");

    private final String title;
    private final String description;

    Action(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title;
    }
}
