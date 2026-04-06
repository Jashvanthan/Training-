public class FileManager {
    private Folder rootFolder;

    public FileManager() {
        rootFolder = new Folder("Root");
    }

    public Folder getRootFolder() {
        return rootFolder;
    }

    public void createFolder(String folderName) {
        Folder folder = new Folder(folderName);
        rootFolder.addItem(folder);
        System.out.println("Folder created: " + folderName);
    }

    public void createTextFile(String name, double size, String extension, String content) {
        TextFile file = new TextFile(name, size, extension, content);
        rootFolder.addItem(file);
        System.out.println("Text file created: " + name);
    }

    public void createImageFile(String name, double size, String extension, String resolution) {
        ImageFile file = new ImageFile(name, size, extension, resolution);
        rootFolder.addItem(file);
        System.out.println("Image file created: " + name);
    }

    public void deleteItem(String name) {
        rootFolder.removeItem(name);
        System.out.println("Item deleted: " + name);
    }

    public void searchItem(String name) {
        FileSystemItem item = rootFolder.findItem(name);
        if (item != null) {
            System.out.println("Item found:");
            item.displayInfo();
        } else {
            System.out.println("Item not found: " + name);
        }
    }

    // Extra Feature: Move item from root to a folder
    public void moveItem(String itemName, String targetFolderName) {
        FileSystemItem item = rootFolder.findItem(itemName);
        FileSystemItem target = rootFolder.findItem(targetFolderName);

        if (item == null) {
            throw new IllegalArgumentException("Source item not found.");
        }

        if (target == null || !(target instanceof Folder)) {
            throw new IllegalArgumentException("Target folder not found.");
        }

        if (item == target) {
            throw new IllegalArgumentException("Cannot move folder into itself.");
        }

        rootFolder.removeItem(itemName);
        ((Folder) target).addItem(item);

        System.out.println("Moved '" + itemName + "' to folder '" + targetFolderName + "'");
    }

    public void showAllItems() {
        rootFolder.listItems();
    }
}
