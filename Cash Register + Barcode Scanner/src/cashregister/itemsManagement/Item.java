package cashregister.itemsManagement;

public class Item {
	public String name;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the code
	 */
	public long getCode() {
		return code;
	}
	/**
	 * @param (long)processedCodeTwo the code to set
	 */
	public void setCode(Long processedCodeTwo) {
		this.code = processedCodeTwo;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	public long code;
	public float price;
	public Item(String name, long code, float price) {
		this.name = name;
		this.code = code;
		this.price = price;
	}
}
