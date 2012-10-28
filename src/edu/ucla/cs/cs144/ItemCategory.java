package edu.ucla.cs.cs144;

public class ItemCategory {
	long itemCategoryRelationID;
	String itemID;
	int categoryID;
	
	/**
	 * @param itemCategoryRelationID
	 * @param itemID
	 * @param categoryID
	 */
	public ItemCategory(long itemCategoryRelationID, String itemID,
			int categoryID) {
		super();
		this.itemCategoryRelationID = itemCategoryRelationID;
		this.itemID = itemID;
		this.categoryID = categoryID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoryID;
		result = prime
				* result
				+ (int) (itemCategoryRelationID ^ (itemCategoryRelationID >>> 32));
		result = prime * result + ((itemID == null) ? 0 : itemID.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemCategory other = (ItemCategory) obj;
		if (categoryID != other.categoryID)
			return false;
		if (itemCategoryRelationID != other.itemCategoryRelationID)
			return false;
		if (itemID == null) {
			if (other.itemID != null)
				return false;
		} else if (!itemID.equals(other.itemID))
			return false;
		return true;
	}
}
