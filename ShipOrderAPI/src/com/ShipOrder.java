package com;

public class ShipOrder {
	private String name="";
	private Integer taiGreen1 =0;
	private Integer taiGreen2 =0;
	private Integer taiLan1 = 0;
	private Integer taiLan2 =0;
	private Integer lanGreen =0;
	private Integer sum;
	
	
	public ShipOrder(String name, Integer taiGreen1, Integer taiGreen2, Integer taiLan1, Integer taiLan2, Integer lanGreen) {
		super();

		this.name = name;
		this.taiGreen1 = taiGreen1;
		this.taiGreen2 = taiGreen2;
		this.taiLan1 = taiLan1;
		this.taiLan2 = taiLan2;
		this.lanGreen = lanGreen;
		
		
		sum = taiGreen1*600 + taiGreen2*1000 + taiLan1*800 + taiLan2*1500 + lanGreen*700;
		
		
	}
	
	
	
	



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTaiGreen1() {
		return taiGreen1;
	}
	public void setTaiGreen1(int taiGreen1) {
		this.taiGreen1 = taiGreen1;
	}
	public int getTaiGreen2() {
		return taiGreen2;
	}
	public void setTaiGreen2(int taiGreen2) {
		this.taiGreen2 = taiGreen2;
	}
	public int getTaiLan1() {
		return taiLan1;
	}
	public void setTaiLan1(int taiLan1) {
		this.taiLan1 = taiLan1;
	}
	public int getTaiLan2() {
		return taiLan2;
	}
	public void setTaiLan2(int taiLan2) {
		this.taiLan2 = taiLan2;
	}
	public int getLanGreen() {
		return lanGreen;
	}
	public void setLanGreen(int lanGreen) {
		this.lanGreen = lanGreen;
	}
	
	
	public int getSum() {
		return sum;
	}
	
	
	
	
}

/*
 * package com.cz;

public class ShipOrder {

	// 建構
	private String name;
	private Integer taiGreen1;
	private Integer taiGreen2;
	private Integer taiLan1;
	private Integer taiLan2;
	private Integer lanGreen;
	//固定
	final private Double greenDiscount = 0.5D;
	final private Double overTen = 0.9D;
	final private Double overTwenty = 0.8D;

	//產生
	private Integer sum;
	private Integer totalTickets;



	public ShipOrder(String name, Integer taiGreen1, Integer taiGreen2, Integer taiLan1, Integer taiLan2, Integer lanGreen) {
		this.name = name;
		this.taiGreen1 = taiGreen1;
		this.taiGreen2 = taiGreen2;
		this.taiLan1 = taiLan1;
		this.taiLan2 = taiLan2;
		this.lanGreen = lanGreen;
	}

	private int sum() {
		if (this.sum == null) {
			this.sum = taiGreen1*700 + taiGreen2*1000 + taiLan1*800 + taiLan2*1500 + lanGreen*700;
		}
		return sum;
	}

	private int totalTickets() {
		if (this.totalTickets == null) {
			totalTickets = taiGreen1 + taiGreen2 + taiLan1 + taiLan2 + lanGreen;
		}
		return totalTickets;
	}

	public String calculate(boolean isGreenLiving) {

		String detailText = "你的訂單資料如下" +
				"\n訂購人為島民：" +getName() +
				"\n綠島單程船票：" + getTaiGreen1() + "張" +
				"\t綠島來回船票：" + getTaiGreen2() + "張" +
				"\n蘭嶼單程船票：" + getTaiLan1() + "張" +
				"\t蘭嶼來回船票：" + getTaiLan2() + "張" +
				"\n蘭嶼單程綠島：" + getLanGreen() + "張" ;


		if (isGreenLiving) {
			// 如果 JRadioButton butt 结果为 true
			detailText += "\n半價後金額：" + ((int)(sum() * greenDiscount)) + "元";
		} else {
			if (totalTickets() >= 0 && totalTickets() <= 9) {
				detailText +="\n總金額：" + sum() + "元";
			} else if (totalTickets() >= 10 && totalTickets() <= 19) {
				detailText += "\n團體九折金額：" + ((int)(sum() * overTen)) + "元";
			} else if (totalTickets() >= 20) {
				detailText += "\n團體八折金額：" + ((int)(sum() * overTwenty)) + "元";
			} else {
				detailText = "訂單無效"+
						"\n輸入欄內禁止空白或無效數字";
			}

		}
		return detailText;
	}




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTaiGreen1() {
		return taiGreen1;
	}
	public void setTaiGreen1(int taiGreen1) {
		this.taiGreen1 = taiGreen1;
	}
	public int getTaiGreen2() {
		return taiGreen2;
	}
	public void setTaiGreen2(int taiGreen2) {
		this.taiGreen2 = taiGreen2;
	}
	public int getTaiLan1() {
		return taiLan1;
	}
	public void setTaiLan1(int taiLan1) {
		this.taiLan1 = taiLan1;
	}
	public int getTaiLan2() {
		return taiLan2;
	}
	public void setTaiLan2(int taiLan2) {
		this.taiLan2 = taiLan2;
	}
	public int getLanGreen() {
		return lanGreen;
	}
	public void setLanGreen(int lanGreen) {
		this.lanGreen = lanGreen;
	}

	
	
}

 */
