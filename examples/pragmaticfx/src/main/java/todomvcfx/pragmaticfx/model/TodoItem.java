package todomvcfx.pragmaticfx.model;

public final class TodoItem {

    private final String text;
    private final boolean completed;

    public TodoItem(String text, boolean completed) {
        this.text = text;
        this.completed = completed;
    }

    public String getText() {
        return text;
    }

    public boolean isCompleted() {
        return completed;
    }

}