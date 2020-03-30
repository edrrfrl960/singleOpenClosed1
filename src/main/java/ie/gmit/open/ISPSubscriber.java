package ie.gmit.open;

/*
 * AUTHOR: Paul Lennon
 * MODIFIED BY: Darragh Freeley
 * LAST MODIFIED: 30/03/2020
 * DESCRIPTION: ISPSubscriber inherits methods from the Subscriber class. A bill for ISPSubscribers is calculated.(Open-Closed Example)
 */
import java.util.List;

public class ISPSubscriber extends Subscriber{

    private long freeUsage;

    public ISPSubscriber() {

    }

    public double calculateBill() {
        List<InternetSessionHistory.InternetSession> sessions = InternetSessionHistory.getCurrentSessions(subscriberId);
        long totalData = sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
        long chargeableData = totalData - freeUsage;
        return chargeableData*baseRate/100;
    }


    /**
     * @return the freeUsage
     */
    public long getFreeUsage() {
        return freeUsage;
    }

    /**
     * @param freeUsage the freeUsage to set
     */
    public void setFreeUsage(long freeUsage) {
        this.freeUsage = freeUsage;
    }

    
}