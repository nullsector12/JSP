package model;

public class Product {
	
	private String[] productList = {
			"JAVA", "HTML5", "CSS3", "JavaScript", "JSP"
	};

	private int num1 = 10;
	private int num2 = 20;

	/**
	 * @return the productList
	 */
	public String[] getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(String[] productList) {
		this.productList = productList;
	}

	/**
	 * @return the num1
	 */
	public int getNum1() {
		return num1;
	}

	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	/**
	 * @return the num2
	 */
	public int getNum2() {
		return num2;
	}

	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public boolean getCheck() {
		return true;
	}
	
}
