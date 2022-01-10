public class Worker implements IWorkable,IEatable,IPayable{
    @Override
    public void eat() {
        System.out.println("Eating only belogs our workers");
    }

    @Override
    public void pay() {
        System.out.println("We pay for our workers");
    }

    @Override
    public void work() {
        System.out.println("It belogs both workers");
    }
}
