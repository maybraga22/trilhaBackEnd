package entities;

public class Entry {
	private long id;
	private String name;
	private String description;
	private String type;
	private String amount;
	private String date;
	private boolean paid;
	private long categoryId;
	
	public Entry(){
	}

	public Entry(long id, String name, String description, String type, String amount, String date, boolean paid,
			long categoryId) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.type = type;
		this.amount = amount;
		this.date = date;
		this.paid = paid;
		this.categoryId = categoryId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String dedsceiption) {
		this.description = dedsceiption;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Entry [id=" + id + 
				", name=" + name + 
				", dedsceiption=" + description + 
				", type=" + type + 
				", amount=" + amount + 
				", date=" + date + 
				", paid=" + paid + 
				", categoryId=" + categoryId + "]";
	}
}