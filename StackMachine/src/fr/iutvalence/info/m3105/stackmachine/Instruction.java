package fr.iutvalence.info.m3105.stackmachine;

public class Instruction {
	
	public final int params;
	public final Object opCode;
	
	public Instruction(int in, Object opcode) {
		this.params=in;
		this.opCode=opcode;
		// TODO Auto-generated constructor stub
	}

	public int[] getParams() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getOpCode() {
		return this.opCode;
	}

}
