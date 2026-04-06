import java.time.LocalDateTime;

public abstract class FileSystemItem {
    private String name;
    private LocalDateTime createdDate;

    public FileSystemItem(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
        this.createdDate = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public abstract void displayInfo();
}