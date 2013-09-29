import akka.actor.UntypedActor;

/**
 * Created with IntelliJ IDEA.
 * User: andi
 * Date: 7/31/12
 * Time: 7:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class Listener extends UntypedActor {
    public void onReceive(Object message) {
        if (message instanceof PiApproximation) {
            PiApproximation approximation = (PiApproximation) message;
            System.out.println(String.format("\n\tPi approximation: \t\t%s\n\tCalculation time: \t%s",
                    approximation.getPi(), approximation.getDuration()));
            getContext().system().shutdown();
        } else {
            unhandled(message);
        }
    }
}
