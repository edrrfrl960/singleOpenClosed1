package ie.gmit.open;

/*
 * AUTHOR: Paul Lennon
 * MODIFIED BY: Darragh Freeley
 * LAST MODIFIED: 30/03/2020
 * DESCRIPTION: PhoneSubscriber inherits methods from the Subscriber class. A bill for PhoneSubscribers is calculated.(Open-Closed Example)
 */

import java.util.List;

public class PhoneSubscriber extends Subscriber{

    private int baseRate;

    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

    /**
     * @return the baseRate
     */
    public int getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate the baseRate to set
     */
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

}