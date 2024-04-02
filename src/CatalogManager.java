import java.util.ArrayList;
import java.util.List;

public class CatalogManager {
    private List<ICatalogItem> items = new ArrayList<>();

    public void addItem(ICatalogItem item) {
        items.add(item);
        item.display();
    }

    public void listItems() {
        for (ICatalogItem item : items) {
            item.display();
        }
    }
}
