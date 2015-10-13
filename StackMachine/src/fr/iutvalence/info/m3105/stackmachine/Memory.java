package fr.iutvalence.info.m3105.stackmachine;

public class Memory {

	public int startAdress;
	public int endAdress;
	
	public Memory(int i, int j) {
		this.startAdress = i;
		this.endAdress = j;
	}

	public void write(int currentAddress, Object opCode) {
		// TODO Auto-generated method stub
		
	}

	public int getStartAddress() {
		return this.startAdress;
	}

}
