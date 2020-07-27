package labTask2;

public class State4_1 extends State3 {
//	public State4_1(State iniHis) {
//		super(iniHis);
//		// TODO Auto-generated constructor stub
//	}
//
//	public State4_1() {
//		// TODO Auto-generated constructor stub
//	}

	public State enter(StateMachineContext context)
	{
		System.out.println("I am in State4_1");
		return this;
	}
	
	public void exit(State prev)
	{
		super.exit(prev);
	}
	
	public void Opertaion4(StateMachineContext context)
	{
		exit(this);
		context.getCurrentState().CurrentStatesRegion[0] = new State4_2().enter(context);
		//context.setCurrentState(CurrentStatesSubStates[0].);
	}
}
