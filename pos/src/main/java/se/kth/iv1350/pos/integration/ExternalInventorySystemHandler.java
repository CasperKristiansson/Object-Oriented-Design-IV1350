package se.kth.iv1350.pos.integration;

import se.kth.iv1350.pos.model.*;
import java.util.*;

public class ExternalInventorySystemHandler {
	// private Item[] storeItems;
	private List<Item> storeItems = new ArrayList<>();
	private List<ItemDTO> itemDTOs = new ArrayList<>();
	
	public ExternalInventorySystemHandler() {
	}

	public void addItem() {
		this.itemDTOs.add(new ItemDTO("Karrékotlett med Ben Skivad ca 1kg ICA", 87.90, 12)); //(Description, price, VAT)
		this.itemDTOs.add(new ItemDTO("Mozzarella 125g Galbani", 16.6, 2.3));
		this.itemDTOs.add(new ItemDTO("Korvbröd 10-p 270g Korvbrödsbagarn", 16.6, 2.3));
		this.itemDTOs.add(new ItemDTO("Apelsinjuice med fruktkött 900ml Innocent", 28.9, 3.9));

		this.storeItems.add(new Item(1, itemDTOs.get(0), 100));
		this.storeItems.add(new Item(2, itemDTOs.get(1), 100));
		this.storeItems.add(new Item(3, itemDTOs.get(2), 100));
		this.storeItems.add(new Item(4, itemDTOs.get(3), 100));
	}

	public Item search(int itemIdentifier) {
		for (Item item : storeItems) {
			if (item.getItemIdentifier() == itemIdentifier) {
				return item;
			}
		}
		return null; // Varan finns inte
	}

	public void update(Sale sale) {
		List<Item> items = sale.getItems();
		List<Integer> itemsQuantity = sale.getCustomerItemsQuantity();

		// Loop som går igenom och matchar kundens önskade föremål med butikens utbud
		for (Item item : items) {
			for (Item item2 : storeItems) {
				if (item == item2) {
					storeItems.get(storeItems.indexOf(item2)).updateQuantity(itemsQuantity.get(items.indexOf(item)));
				}
			}
		}
	}
}
