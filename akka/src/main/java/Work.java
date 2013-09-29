/**
 * Created with IntelliJ IDEA.
 * User: andi
 * Date: 7/31/12
 * Time: 7:11 AM
 * To change this template use File | Settings | File Templates.
 */
class Work {
    private final int start;
    private final int nrOfElements;

    public Work(int start, int nrOfElements) {
        this.start = start;
        this.nrOfElements = nrOfElements;
    }

    public int getStart() {
        return start;
    }

    public int getNrOfElements() {
        return nrOfElements;
    }
}
