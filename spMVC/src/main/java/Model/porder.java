package Model;

public class porder {
	private Integer id;
	private String name;
	private Integer lcd;
	private Integer ram;
	private Integer sum;
	
	public porder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public porder(String name, Integer lcd, Integer ram) {
		super();
		this.name = name;
		this.lcd = lcd;
		this.ram = ram;
		this.sum = lcd*4999+ram*1280;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLcd() {
		return lcd;
	}

	public void setLcd(Integer lcd) {
		this.lcd = lcd;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
}
