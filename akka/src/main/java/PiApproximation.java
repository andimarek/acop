import akka.util.Duration;

/**
 * Created with IntelliJ IDEA.
 * User: andi
 * Date: 7/31/12
 * Time: 7:11 AM
 * To change this template use File | Settings | File Templates.
 */
class PiApproximation {
    private final double pi;
    private final Duration duration;

    public PiApproximation(double pi, Duration duration) {
        this.pi = pi;
        this.duration = duration;
    }

    public double getPi() {
        return pi;
    }

    public Duration getDuration() {
        return duration;
    }
}
