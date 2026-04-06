public class MyFile extends FileSystemItem {
    private double size;
    private String extension;

    public MyFile(String name, double size, String extension) {
        super(name);
        if (size < 0) {
            throw new IllegalArgumentException("File size cannot be negative.");
        }
        if (extension == null || extension.trim().isEmpty()) {
            throw new IllegalArgumentException("Extension cannot be empty.");
        }
        this.size = size;
        this.extension = extension;
    }

    public double getSize() {
        return size;
    }

    public String getExtension() {
        return extension;
    }

    @Override
    public void displayInfo() {
        System.out.println("File: " + getName() +
                " | Size: " + size + " KB" +
                " | Extension: " + extension +
                " | Created: " + getCreatedDate());
    }
}