package Example1;

public class GumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state;
    int count;

    // Конструктор получает исходное количество шариков. Если оно отлично от нуля,
    // то автомат переходит в состояние NO_QUARTER, ожидая, пока кто нибудь бросит монетку;
    // в противном случае автомат остается в состоянии SOLD_OUT.
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    @Override
    public String toString() {
        return "\nMighty Gumball, Inc.\n" +
                "Java-enabled Standing Gumball Model #2004\n" +
                "Inventory: " + count + " gumballs\n" +
                "Machine is waiting for quarter \n";
    }

    void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }
}
