package labTask2;

public class StateMachineContext {
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public StateMachineContext() {
		currentState = new State1();
	}

	public void Opertaion1() throws Exception {
		currentState.Opertaion1(this);
	}

	public void Opertaion2() throws Exception {
		currentState.Opertaion2(this);
	}

	public void Opertaion3() throws Exception {
		currentState.Opertaion3(this);
	}

	public void Opertaion4() throws Exception {
		currentState.CurrentStatesRegion[0].Opertaion4(this);
	}

	public void Operation5() throws Exception {
		if (currentState.CurrentStatesRegion[1] == null) {
			throw new Exception("Final State achieved for lower region.");
		}
		else
		currentState.CurrentStatesRegion[1].Operation5(this);
	}

	public void Operation6() throws Exception {
		currentState.CurrentStatesRegion[0].Operation6(this);
	}

	public void Operation7() throws Exception {
		if (currentState.CurrentStatesRegion[1] == null) {
			throw new Exception("Final State achieved for lower region.");
		}
		else
		currentState.CurrentStatesRegion[1].Operation7(this);
	}

	public void OperationExit() throws Exception {
		if (currentState instanceof State2) {
			System.out.println("Final state acheived");
			System.exit(0);
		} else {
			throw new Exception("Not allowed to exit.");
		}
	}
}
