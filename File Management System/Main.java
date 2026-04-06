public class Main {
    public static void main(String[] args) {
        try {
            User user = new User("Jashvanthan");
            user.displayUser();

            FileManager fm = new FileManager();

            fm.createFolder("Documents");
            fm.createTextFile("Notes", 25.5, "txt", "This is OOP file management system.");
            fm.createImageFile("Photo", 1024, "jpg", "1920x1080");

            System.out.println("\n--- All Items in Root ---");
            fm.showAllItems();

            System.out.println("\n--- Search Item ---");
            fm.searchItem("Notes");

            System.out.println("\n--- Move Item ---");
            fm.moveItem("Notes", "Documents");

            System.out.println("\n--- Root After Moving ---");
            fm.showAllItems();

            System.out.println("\n--- Display Inside Documents Folder ---");
            Folder docs = (Folder) fm.getRootFolder().findItem("Documents");
            if (docs != null) {
                docs.listItems();
            }

            System.out.println("\n--- Delete Item ---");
            fm.deleteItem("Photo");

            System.out.println("\n--- Final Root Items ---");
            fm.showAllItems();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}