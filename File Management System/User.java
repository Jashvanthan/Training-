import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemItem {
    private List<FileSystemItem> items;

    public Folder(String name) {
        super(name);
        items = new ArrayList<>();
    }

    public void addItem(FileSystemItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Cannot add null item.");
        }

        for (FileSystemItem existing : items) {
            if (existing.getName().equalsIgnoreCase(item.getName())) {
                throw new IllegalArgumentException("Item with same name already exists in folder.");
            }
        }

        items.add(item);
    }

    public void removeItem(String name) {
        FileSystemItem item = findItem(name);
        if (item == null) {
            throw new IllegalArgumentException("Item not found: " + name);
        }
        items.remove(item);
    }

    public FileSystemItem findItem(String name) {
        for (FileSystemItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }

    public List<FileSystemItem> getItems() {
        return items;
    }

    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("Folder is empty.");
            return;
        }

        System.out.println("Items inside folder '" + getName() + "':");
        for (FileSystemItem item : items) {
            item.displayInfo();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Folder: " + getName() +
                " | Total Items: " + items.size() +
                " | Created: " + getCreatedDate());
    }
}