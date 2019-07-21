package entity;

public class Machine {
	private int machineId;//机器号
	private String position;//位置信息
	private int machineStatue;//机器状态
	public Machine() {
		super();
	}
	public Machine(int machineId, String position, int machineStatue) {
		super();
		this.machineId = machineId;
		this.position = position;
		this.machineStatue = machineStatue;
	}
	public int getMachineId() {
		return machineId;
	}
	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getMachineStatue() {
		return machineStatue;
	}
	public void setMachineStatue(int machineStatue) {
		this.machineStatue = machineStatue;
	}
	@Override
	public String toString() {
		return "Machine [machineId=" + machineId + ", position=" + position + ", machineStatue=" + machineStatue + "]";
	}
	
}
