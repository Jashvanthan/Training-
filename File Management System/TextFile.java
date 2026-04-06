public class TextFile extends MyFile {
    private String content;

    public TextFile(String name, double size, String extension, String content) {
        super(name, size, extension);
        this.content = content == null ? "" : content;
    }

    public void readContent() {
        System.out.println("Reading content of " + getName() + ":");
        System.out.println(content);
    }

    @Override
    public void displayInfo() {
        System.out.println("Text File: " + getName() +
                " | Size: " + getSize() + " KB" +
                " | Extension: " + getExtension() +
                " | Content Length: " + content.length());
    }
}