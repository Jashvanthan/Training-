public class ImageFile extends MyFile {
    private String resolution;

    public ImageFile(String name, double size, String extension, String resolution) {
        super(name, size, extension);
        if (resolution == null || resolution.trim().isEmpty()) {
            throw new IllegalArgumentException("Resolution cannot be empty.");
        }
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    @Override
    public void displayInfo() {
        System.out.println("Image File: " + getName() +
                " | Size: " + getSize() + " KB" +
                " | Extension: " + getExtension() +
                " | Resolution: " + resolution);
    }
}