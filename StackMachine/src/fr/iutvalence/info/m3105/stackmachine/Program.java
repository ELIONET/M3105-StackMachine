package fr.iutvalence.info.m3105.stackmachine;

public class Program {

	public Instruction instruction[];
	
	public Program(Instruction[] instructions) {
		this.instruction=instructions;
	}

	public Instruction getInstructionAt(int instructionNumber) {
		return this.instruction[instructionNumber];
	}

	public int getInstructionCount() {
		return this.instruction.length;
	}

}
